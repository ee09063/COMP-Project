import org.antlr.runtime.*;
import java.io.*;

public class ANTLRDemo {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream in = new ANTLRInputStream("hello");
        JSONLexer lexer = new JSONLexer(in);
        TokenStream tokens = new TokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        parser.start();
    }
}