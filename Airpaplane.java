

package airpaplane;

import java.util.Scanner;


public class Airpaplane {

   private boolean seats[];
   private int N;
   public int p,s;
   public Airpaplane(int N)
            
   {
       this.N=N;
       seats=new boolean[N];
   }
   Scanner sc=new Scanner (System.in);   
   
   public void listUnOccupiedSeats()
           
   {
       System.out.println("List of UnOccuppied seats are");
       for(int i=0;i<N;i++)
           if(seats[i]==false)
               
           System.out.println(i);
   }
   
   public void reserveSeats(int m)
       
   {
      
       System.out.println("Do you want to reserve a seat??...if Yes please press 1");
       m=sc.nextInt();
       if(m==1)
       {
           System.out.println("Enter the seat number you want to reserve");
            int s=sc.nextInt();
           if(seats[s]==false)
           {
               seats[s]=true;
               System.out.println("You have reserved the seat number\n"+s);
           }
          else
           {
               System.out.println("The Seat has alredy been occupied");
           }
       }
       else
       {
           System.out.println("Byee thankyou for choosing to be served welcome again");
           System.exit(0);
       }
      
   }
   
   public void canccel()
   {
       System.out.println("Do you want to cancel the seat?? If Yes press 1");
       int p=sc.nextInt();
      if(p==1)
      {
         System.out.println("Enter the seat number you want to cancel");
         int c=sc.nextInt();
        seats[c]=false;
          System.out.println("List of unoccuppied  seats after the seat has been cancelled");
        for(int i=0;i<N;i++)
        {
          
            System.out.println(i);
        }
      }
   }
 
   
    
}
