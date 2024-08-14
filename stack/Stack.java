public class Stack
{
        int[] Arr = new int[10];
        int t;
        Stack()
        {
            t=-1;
        }

        void push(int num)
        {
            if(t==9)
                System.out.println("Stack is Full");
            else    
                Arr[++t]  = num;

        }
       int pop()
        {
            if(t==-1){
                System.out.println("Stack is Empty");
                return 0;
            }
            else
                return Arr[t--];    
        }
        
}
