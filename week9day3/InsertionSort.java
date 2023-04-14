 
import java.util.*;
class Insertion
  {
    public static void main(String args[])
    {
       int i,j,t,n;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter Array Size:");
       n=sc.nextInt();
      int a[]=new int[n];
 
 
 
      System.out.println("Enter Array Size:");
      for(i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt(); 
        }
      System.out.println("The Elements Before Sorting is:");
      for(i=0;i<a.length;i++)
        {
          System.out.println("\t"+a[i]);
        }
         //Insertion Sort  
           for(i=1;i<=n-1;i++)
                 {          
              for(j=i;j>0 && a[j-1]>a[j];j--)
               {
                         t=a[j];
                         a[j]=a[j-1];
                         a[j-1]=t;
                  }
            }
     System.out.println("The Elements After Sorting is:");
      for(i=0;i<a.length;i++)
        {
          System.out.println("\t"+a[i]);
        }
    }
  }