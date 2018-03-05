import java.io.*;
public class Queue
{
    static InputStreamReader isr;
    static BufferedReader br;
    int queue[],front,rear;
    static
    {
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }
    Queue()
    {
        queue = new int[100];
        front = rear = -1 ;
    }
    
    void enqueue(int element)
    {
        if(rear==99)
        {
            System.out.println("Queue Full\nFirst Dequeue and then Enqueue");
        }
        else
        {
            rear++;
            queue[rear]=element;
        }
    }
    void dequeue()
    {
        if((front==rear-1)||((front==-1)&&(rear==-1)))
        {
            System.out.println("Queue Empty!!!");
        }
        else
        {
            System.out.print("Before dequeue ");
            show();
            front++;
            System.out.print("After dequeue ");
            show();
        }
    }
    void show()
    {
        System.out.println("Queue : ");
        for (int i = front ; i < rear ; i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) throws IOException
    {
        int choice;
        Queue q = new Queue();
        System.out.println("QUEUE!!!");
        do
        {
            System.out.println("Press 1. for Enqueue");
            System.out.println("Press 2. for Dequeue");
            System.out.println("Press 3. for Show");
            choice= Integer.parseInt(br.readLine());
            
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the element to be added : - ");
                    q.enqueue(Integer.parseInt(br.readLine()));
                    break;
                }
                case 2:
                {
                    q.dequeue();
                    break;
                }
                case 3:
                {
                    q.show();
                    break;
                }
                case 4:
                {
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
