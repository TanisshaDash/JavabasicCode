import java.util.*;


public class Solutions {
    public static int CalcPow (int x,int n){
        int result = 1;
       for(int i=0; i<n; i++) {
           result = result * x;
           
       }
       return result;
    }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter x");
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();
       System.out.println(CalcPow(x, n));
      

   }


       
   }   

    
