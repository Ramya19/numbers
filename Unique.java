/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Unique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int[] a=new int[100];int x;
        System.out.println("enter size of array"); 
         x=sc.nextInt();
         System.out.println("enter elements of ur array");
        for(int i=0;i<x;i++)
             a[i]=sc.nextInt();
        for(int j=0;j<x;j++)
         for(int i=j+1;i<x;i++)
            if(a[j]==a[i])
            {
                a[i]='\0';
                a[j]='\0';
            }
        for(int i=0;i<x;i++)
        if(a[i]!='\0')
            System.out.print( " "+a[i]);
    }
}
