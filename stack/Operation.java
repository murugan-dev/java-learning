class Operation
{
    public static void main(String args[])
    {
        Stack n = new Stack();

        n.push(1);
        n.push(2);
        n.push(3);
        n.push(4);
        n.push(1);
        n.push(2);
        n.push(3);
        n.push(4);
        n.push(1);
        n.push(2);
        n.push(3);
        n.push(4);

        System.out.println(n.pop());
    }
}