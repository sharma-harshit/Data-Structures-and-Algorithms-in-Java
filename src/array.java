import java.io.*;
public class array
{
    
    int arr[];
    int size;
    static InputStreamReader isr ;
    static BufferedReader br;
    
    static
    {
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }
    
    void input()
    {
        try 
        {
            //Input the size of array
            do
            {
                System.out.println("Enter the number of values in array");
                size = Integer.parseInt(br.readLine());
            }
            while(size<=0);
            
            //Creating the required array
            arr = new int[100];
            for (int i = 0; i < size; i++) 
            {
                System.out.println("Enter the "+(i+1)+" element in array");
                arr[i] =  Integer.parseInt(br.readLine());
            }
            
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    void output()
    {
        if(size==0)
        {
            System.out.println("Enter the values in the array first");
            this.input();
        }
        for (int i = 0; i < size; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) throws IOException
    {        
        array a1 = new array();
        int choice;
        do
        {
            System.out.println("1. Put the values in the array");
            System.out.println("2. Show the values in the array");
            System.out.println("3. Adding an element in the array");
            System.out.println("4. Deleting an element from the array");
            
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1 : 
                {
                    a1.input();
                    break;
                }
                case 2 : 
                {
                    a1.output();
                    break;
                }
                case 3 : 
                {
                    int inner_choice;
                    do
                    {
                        System.out.println("1.Add element at first poistion");
                        System.out.println("2.Add element at last poistion");
                        System.out.println("3.Add element at the middle poistion");                        
                        System.out.println("4.Adding an element any particular position");
                        System.out.println("5.Add element after a particular element");
                        System.out.println("6.Add element before a particular element");
                        
                        inner_choice=Integer.parseInt(br.readLine());
                        switch(inner_choice)
                        {
                            case 1 :
                            {
                                
                                break;
                            }
                            case 2 :
                            {
                                
                                break;
                            }
                            case 3 :
                            {
                                
                                break;
                            }
                            case 4 :
                            {
                                
                                break;
                            }
                            case 5 :
                            {
                                
                                break;
                            }
                            default:
                            {
                                System.out.println("Enter valid choice");
                            }
                        }
                    }
                    while(inner_choice!=5);
                    
                    break;
                }
                case 4 : 
                {
                    
                    break;
                }
                case 5 : 
                {
                    
                    break;
                }
                case 6 : 
                {
                    
                    break;
                }
                case 7 : 
                {
                    
                    break;
                }
                case 8 : 
                {
                    System.out.println("Thanks for using. :-)");
                    break;
                }
                
                default:
                {
                    System.out.println("Enter valid choice");
                }
            }
        }
        while(choice!=8);
    }
}
