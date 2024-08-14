public class Source_Queue
{
     int []a = new int[10]; /// FIFO
     int t,n,n1;
     
     Source_Queue()
     {
        t = -1;
        n = 0;
        n1 = 0;
     }

     void push(int num)
     {
        if(t==9)
            System.out.println("Queue is Full");
        else
        {
            a[++t] = num;
            n1++;
        }    
     }

     int pop()
     {
        if(t == -1 || n1 == 0)
        {
            System.out.println("Queue is Empty");
            return 0;
        }    
        else
        {
            --n1;
            return a[n++]; 
        }
               
     }

}