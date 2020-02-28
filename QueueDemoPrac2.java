
package queuepract2;

public class QueueDemoPrac2  implements QueueInterfacePract{
    private String arr[];
    private int f,r,N;
    
    public QueueDemoPrac2(int N)
    {
        this.N=N;
        arr=new String[N];
        f=r=-1;
    }
    
    public boolean isEmpty()
    {
        if(f==-1 && r==-1)
        return true;
        else
            return false;
    }
    public void enqueue(String m)
    {
        if(r==N-1)
            System.out.println("No More Space to add");
        else if(f==-1 && r==-1)
        {
            r=f=0;
            arr[r]=m;
            
        }
        else
        {
            r++;
            arr[r]=m;
        }   
           
    }
    public String dequeue()
    {
         String temp = null;
        if(f==-1 &&r==-1)
            System.out.println(" No Item to be dequeued");
        else
        {
            temp= arr[f];
            arr[f]=null;
            r--;
            
        }
        return temp;
        
        
    }
    public String front()
    {
        return arr[f];
    }
    
    public void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public int size()
    {
        return r+1;
    }
    
}



