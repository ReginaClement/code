public class Stack
        {
            public static void main(String[] args)
            {
                Stack2 stack2 = new Stack2();
                stack2.pushMethod(100);
                stack2.pushMethod(200);
                stack2.pushMethod(290);
                stack2.pushMethod(456);
                stack2.show();

                System.out.println("pop method "+stack2.popMethod());
                System.out.println("peek method "+stack2.peekMethod());



            }
                static class Stack2
                {
                    int[] i = new int[10];
                    int j =0;
                    public void pushMethod(int data)
                    {
                        i[j++] = data;
                    }
                    public int popMethod()
                    {
                        return i[j--];
                    }
                    public int peekMethod()
                    {
                        return i[j-1];
                    }
                    public void show()
                    {
                        for(int k=0; k>j; k++)
                        {
                            System.out.println(i[k]);
                        }
                    }
}
}
