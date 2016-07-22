
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jagan
 */
public class question {
    public static void main(String[] args){ 
int s=0,sum1=0,n2,n1,avg,avg1;
int b,countt=0,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 5 elements");
int[] a=new int[100];
for(int i=0;i<5;i++)
a[i]=sc.nextInt();
n2=a.length;b=n2;
for(int j=0;j<n2/2;j++)
{
s=s+a[j];
countt++;
}
for(int i=b/2;i<b;i++)
{
sum1=sum1+a[i];
c++;
}
avg=s/countt;
avg1=sum1/c;
if(avg==avg1)
System.out.println("first part and sceond part average is same");
else
System.out.println("first part and sceond part average is same");
}
}

    
    

