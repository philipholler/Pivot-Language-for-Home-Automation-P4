package Compiler;

import antlr.PivotLexer;
import antlr.PivotParser;
import node.ProgramNode;
import node.base.Node;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.codegen.ClassGenerationVisitor;
import visitor.codegen.MainGenerationVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Compiler {

    public static final String SOURCE_FILE = "testProgram";
    public static final boolean COMPILER_DEBUG_MODE = true;

    public static void main(String[] args) {

        try{
            // Input test file name. The rest creates the lexer and parser.
            CharStream cs = fromFileName(SOURCE_FILE);
            PivotLexer lexer = new PivotLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            PivotParser parser = new PivotParser(token);

            // Create parse tree with parser
            ParseTree tree = parser.program();

            // Visit with AstBuilderVisitor to create ast
            AstBuilderVisitor astVisitor = new AstBuilderVisitor();
            Node ast = astVisitor.visit(tree);

            // Print ast. Use the Node.getTreeString() to pretty-print the AST.
            System.out.println(ast.getTreeString(0));

            // Decorate AST using all visitors
            decorateAST(ast);

            // Print the symbol table, which is found inside the first node of type ProgramNode
            System.out.println(((ProgramNode)ast).getSt());

            // Optimise expressions
            optimiseExpr(ast);

            // Print new AST
            System.out.println(ast.getTreeString(0));

            // Generate java classes corresponding to the (device and signal) type definitions
            ClassGenerationVisitor classGenVisitor = new ClassGenerationVisitor();
            classGenVisitor.visit(ast);
            MainGenerationVisitor mainGenVisitor = new MainGenerationVisitor();
            mainGenVisitor.visit(ast);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void decorateAST(Node ast){
        ast.accept(new FunctionVisitor());

        ast.accept(new DeclarationVisitor());

        ast.accept(new TypeAssignmentVisitor());

        ast.accept(new TypeCheckerVisitor());
    }

    private static void optimiseExpr(Node ast){
        ast.accept(new OptimiseExprVisitor());
    }
}