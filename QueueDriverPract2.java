
package queuepract2;

import java.util.Scanner;


public class QueueDriverPract2 {
    public static void main(String[] args)
    { int N ;
        System.out.println("Enter the size of an array");
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        
        QueueDriverPract2  QN  = new QueueDriverPract2 (N);
     
        String m;
        System.out.println("Enter the Strings");
        for(int i=0;i<N;i++)
        {
            m=sc.next();
            QN.enqueue(m);
        }
        System.out.println("\nStrings Entered are:");
        
        QN.display();
       
       System.out.println("*******Display the first String Front******");
       System.out.println(QN.front());
       System.out.println("******Display false if it is not empty or else True*******");
        System.out.println(QN.isEmpty());
        System.out.println("*******After dequeue******");
        System.out.println(QN.dequeue());
         System.out.println("****Return the Size**");
         System.out.println(QN.size());
  
      
    
    }
    
    
}
