/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hunt2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Hunt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int value; 
        int temp=0;
        int[] r=new int[5];
        System.out.println("enter  elements in array");
        for(int i=0;i<5;i++)
        {
            r[i]=sc.nextInt();
        }
        System.out.println("user number"); 
        value=sc.nextInt();
          for(int i=0;i<5;i++)
          {
         for(int j=i;j<5;j++)
         {
             if(r[i]+r[j]==value)
             {  temp++;
                 System.out.println(r[i]+"+ "+r[j]+"= "+value);
                 System.out.println("value present in array");
             }
    
          }}
          if(temp==0)
              System.out.println("user number not found");
    }
}
