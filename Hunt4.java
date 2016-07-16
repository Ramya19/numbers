/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hunt4;

/**
 *
 * @author Student
 */
public class Hunt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "hack the world";
        //String input="AliveisAwesome";
  StringBuilder input1 = new StringBuilder();
  input1.append(input);
  input1=input1.reverse(); 
  for (int i=0;i<input1.length();i++)
  System.out.print(input1.charAt(i));
     } 
    }

