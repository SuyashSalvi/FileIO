/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;
import java.io.*;
/**
 *
 * @author Suyash
 */
public class FileIO {
    


   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      
          try (FileOutputStream fout = new FileOutputStream("output.txt")) {
              fout.write(65);
          }
      
//      finally {
//         if (in != null) {
//            in.close();
//         }
//         if (out != null) {
//            out.close();
//         }
//      }
//      finally {
//         if (in != null) {
//            in.close();
//         }
//         if (out != null) {
//            out.close();
//         }
//      }
   }
}

