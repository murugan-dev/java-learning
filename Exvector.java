import java.util.*;

class Exvector
{
    public static void main(String args[]) // welco
    {
        Vector<Integer> cap = new Vector<Integer>();

        cap.add(1);
        cap.add(2);
        
        System.out.println(cap);
        System.out.println(cap.capacity());

        cap.add(1);
        cap.add(2);
        cap.add(1);
        cap.add(2);
        System.out.println(cap);
        System.out.println(cap.capacity());
        cap.remove(2);

        cap.add(11);
        cap.add(21);
        cap.add(13);
        cap.add(24);

        System.out.println(cap);
        System.out.println(cap.capacity());


    }
}