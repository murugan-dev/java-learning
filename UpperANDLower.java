import java.util.*;
//import java.io.*;

class UpperANDLower
{
    public static void main(String args[])
    {
        String str = "WELCome welcOMEUUUUUUUUUUUUUUUUUUUUUURT_You";

        String low ="";
        String upper = "";
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
               upper = upper + str.charAt(i);
            }
            else
            {
                low  = low + str.charAt(i);
            }
        }

        System.out.println("Upper string :  "+upper);
        System.out.println("Lower string  : "+low);

    }
}