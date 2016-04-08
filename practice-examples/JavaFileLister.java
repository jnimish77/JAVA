import java.io.*;

public class JavaFileLister {
   public static void main(String[] args) {
      File dir = new File("C:");
      String[] children = dir.list();
      if (children == null) {
         System.out.println( "Either dir does not exist or is not a directory");
      }
	  else {
         for (int i=0; i< children.length; i++) {
            String filename = children[i];
            if (filename.endsWith(".java") || filename.endsWith(".JAVA"))
            {
            	System.out.println(filename);
             }
            
         }
      }
   }
}
