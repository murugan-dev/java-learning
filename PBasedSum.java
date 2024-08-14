import java.util.*;
import java.io.*;

class Method
{
    public static int fun(int a[])
    {
        int n = a.length;
        int i=0;
       int sum =0; 
       while(i<n)
       {
            a[i] = a[i]%10;
            a[i] = a[i] * a[i];
            sum += a[i];
            i++;
       }
       return sum; 
    }      
}
class PBasedSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int[] a = new int[n];

       for(int i=0; i<n; i++)
       {
        a[i] = sc.nextInt();
       }
    //     for(int i=0; i<n; i++)
    //    {
    //     System.out.print(a[i] + " ");
    //    }
    Method obj= new Method();

    int sum=obj.fun(a);
    System.out.print(sum);
       
    }
}


