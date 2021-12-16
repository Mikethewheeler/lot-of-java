import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
      for (int i=0; i<2; i++) {
         File saveData = new File("saveData");
         printTwice("Data saved!");
      }
   }
 
 
   public static void printTwice(String fname) {
      for (int i=0; i<2; i++) {
         System.out.prinln(fname);
      }
   }
}
