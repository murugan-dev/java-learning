import java.util.*;
import java.io.*;
class Summa
{
    public static void main(String args[])
    {
      Set<Integer> arr = new HashSet<>();

      arr.add(1);
      arr.add(1);
      arr.add(2);
      arr.add(1);
      arr.remove(1);
      arr.remove(2);

      System.out.println(arr.size());
      
           
    }
}