class Operation_Queue
{
    public static void main(String args[])
    {
        Source_Queue Q = new Source_Queue();

        Q.push(1);
        Q.push(2);
        Q.push(3);
        Q.push(4);

        System.out.println(Q.pop());
        System.out.println(Q.pop());
        System.out.println(Q.pop());
        System.out.println(Q.pop());
        System.out.println(Q.pop());
    }
}