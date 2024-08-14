import java.util.*;
class MergeArr
{
    static List<Integer> meArr(List<Integer> n1, List<Integer> n2)
    {
        int n2Size = n2.size();

        for(int i=0; i<n2Size; i++)
        {

            n1.add(n2.get(i));
        }
        return n1;
    }
    public static void main(String args[])
    {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a2.add(4);
        a2.add(5);
        a2.add(6);

        List<Integer> mArr = new ArrayList<>();

        mArr = meArr(a1,a2);

        System.out.println(mArr);
    }
}