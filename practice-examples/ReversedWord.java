import java.util.*;


public class ReversedWord 
{
    public static String s ="\"write once, run anywhere\" (WORA), meaning that compiled Java code can run on all platforms without recompilation...";
    public static void main(String[] args) {
            Stack<String> stack = new Stack<String>();
            for(String s1 : s.replaceAll("[^a-zA-Z'\\s]","").split("\\s+"))
              stack.push(s1);
            while(!stack.empty())
              System.out.print(stack.pop() + " ");
          }
    
    }
