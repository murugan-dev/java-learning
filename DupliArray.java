import java.util.*;
import java.io.*;

class DupliArray
{
    public static List<Integer> uniFun(List<Integer> n)
    {
        List<Integer> uEl = new ArrayList<>();
        List<Integer> cEl = new ArrayList<>();

        for(int i: n)
        {
            if(uEl.contains(i))
            {
               cEl.add(i);
            }
            uEl.add(i);
        }
        
        return (uEl->cEl);
    }
    public static void main(String args[])
    {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println(a);

        List<Integer> uni = new ArrayList<>();

        uni = uniFun(a);

        System.out.println(uni);

    }
}