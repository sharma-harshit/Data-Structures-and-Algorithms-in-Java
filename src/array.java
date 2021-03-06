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
    
    int inputElement()
    {
        try
        {
            System.out.println("Enter the number ");
            return Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    
    void addAtFirst()
    {
        int num;
        do
        num = inputElement();
        while(num!=-1);
        
        for(int i = size;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0] = num;
        size++;
    }
    
    void addAtLast()
    {
        int num;
        do
            num = inputElement();
        while(num!=-1);
        
        arr[size] = num;
        size++;
    }
    
    void addAtMiddle()
    {
        int num;
        do
            num = inputElement();
        while(num!=-1);
        
        int pos=size/2;
        for(int i = size ; i > pos ; i-- )
        {
            arr[i] = arr[i-1];
        }
        arr[pos] = num;
        size++;
    }
    
    void addAtPosition(int position)
    {
        int num;
        do
            num = inputElement();
        while(num!=-1);
        
        int index = position-1;
        for(int i=size;i>index;i--)
        {
            arr[i]= arr[i-1];
        }
        arr[index]=num;
        size++;
    }
    
    void addAfterElement(int element)
    {
        int index =linearSearch(element);
        if(index!=-1)
        {
            int num;
            do
                num = inputElement();
            while(num!=-1);

            for(int i = size ; i > index+1 ; i--)
            {
                arr[i] = arr[i-1];
            }
            size++;
            arr[index+1] = num;
        }
        else
        {
            System.out.println("Entered element doesn't exist!!\nPlease try again.");
        }
    }
    
    void addBeforeElement(int element)
    {
        int index =linearSearch(element);
        if(index!=-1)
        {
            int num;
            do
                num = inputElement();
            while(num!=-1);

            for(int i = size ; i > index ; i--)
            {
                arr[i] = arr[i-1];
            }
            size++;
            arr[index] = num;
        }
        else
        {
            System.out.println("Entered element doesn't exist!!\nPlease try again.");
        }
    }
    
    
    
    int linearSearch(int element)
    {
        for (int i = 0; i < size; i++) 
        {
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }
    
    int binarySearch(int element)
    {
        int start=0,end=size-1,mid;
        for(;start<=end;)
        {
            mid= (start+end)/2;
            if(arr[mid] == element)
            {
                return mid;
            }
            else if(arr[mid] > element)
            {
                end=mid-1;
            }
            else if (arr[mid] < element)
            {
                start = mid+1;
            }
        }
        return -1;
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
            System.out.println("5. Search any element in the array");
            
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
                        System.out.println("1. Add element at first poistion");
                        System.out.println("2. Add element at last poistion");
                        System.out.println("3. Add element at the middle poistion");                        
                        System.out.println("4. Adding an element any particular position");
                        System.out.println("5. Add element after a particular element");
                        System.out.println("6. Add element before a particular element");
                        
                        inner_choice=Integer.parseInt(br.readLine());
                        switch(inner_choice)
                        {
                            case 1 :
                            {
                                a1.addAtFirst();
                                break;
                            }
                            case 2 :
                            {
                                a1.addAtLast();
                                break;
                            }
                            case 3 :
                            {
                                a1.addAtMiddle();
                                break;
                            }
                            case 4 :
                            {
                                System.out.println("Enter the position at the number will be added");
                                a1.addAtPosition(Integer.parseInt(br.readLine()));
                                break;
                            }
                            case 5 :
                            {
                                System.out.println("Enter the element after which number will be added");
                                a1.addAfterElement(Integer.parseInt(br.readLine()));
                                break;
                            }
                            case 6 :
                            {
                                System.out.println("Enter the element before which number will be added");
                                a1.addBeforeElement(Integer.parseInt(br.readLine()));
                                break;
                            }                            
                            default:
                            {
                                System.out.println("Enter valid choice");
                            }
                        }
                    }
                    while(inner_choice!=7);
                    
                    break;
                }
                case 4 : 
                {
                    
                    break;
                }
                case 5 : 
                {
                    int inner_choice;
                    System.out.println("Enter the element to be searched");
                    int searchElement = Integer.parseInt(br.readLine());
                    do
                    {
                        System.out.println("1. Linear Search");
                        System.out.println("2. Binary Search");
                        System.out.println("3. Go back to the previous menu");
                        
                        inner_choice=Integer.parseInt(br.readLine());
                        
                        switch(inner_choice)
                        {
                            case 1 :
                            {
                                int result = a1.linearSearch(searchElement);
                                if(result!=-1)
                                {
                                    System.out.println("Found!! at position "+ (result+1));
                                }
                                else
                                {
                                    System.out.println("Not Found!");
                                }
                                break;
                            }
                            case 2 :
                            {
                                int result = a1.binarySearch(searchElement);
                                if(result!=-1)
                                {
                                    System.out.println("Found!! at position "+ (result+1));
                                }
                                else
                                {
                                    System.out.println("Not Found!");
                                }
                                break;
                            }
                            default:
                            {
                                System.out.println("Enter valid choice");
                            }
                        }
                    }
                    while(inner_choice!=3);
                    
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
