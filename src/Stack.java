import java.io.*;
public class Stack
{
    static InputStreamReader isr ;
    static BufferedReader br;
    int top;
    int stack[];
    
    static
    {
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }
    
    Stack()
    {
        stack = new int[100];
        top=-1;
    }
    
    
    void push(int element)
    {
        if(top<99)
        {            
            top++;
            stack[top]=element;
        }       
        else
        {
            System.out.println("Stack is full!!!\nPlease pop some elements to push.");
        }
    }
    
    void pop()
    {
        if(top>-1)
        {
            System.out.println("Before popping");
            peep();
            top--;
            System.out.println("After popping");
            peep();
        }       
        else
        {
            System.out.println("Stack is Empty!!!\nCan't pop anything.");
        }
    }
    
    void peep()
    {
        if(top>=0)
            System.out.println("Top of the stack is " + stack[top]);
        else
            System.out.println("Stack empty!!!");
    }
    
    public static void main(String[] args) throws IOException
    {
        
        int choice;
        Stack s = new Stack();
        System.out.println("STACK!!!");
        do
        {
            System.out.println("Press 1. for Push");
            System.out.println("Press 2. for Pop");
            System.out.println("Press 3. for Peep");
            System.out.println("Press 4. to Exit");
            choice= Integer.parseInt(br.readLine());
            
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the element to be added");
                    s.push(Integer.parseInt(br.readLine()));
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.peep();
                    break;
                }
                default:
                {
                    System.out.println("Please enter valid chioce");
                }
            }
        }
        while(choice!=4);
    }
}
