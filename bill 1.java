package tutorial;
import java.util.*; 

public class bill1  
{   
    public static void main(String args[]) 
    {     
        int units;  
  
        double billToPay = 0;  
           
        Scanner sc = new Scanner(System.in);  
  
        System.out.println("Enter number of units for calculating electricity bill.");  
        units = sc.nextInt();  
  
        if(units < 100)  
        {  
            billToPay = units * 10;  
        }  
        else if(units < 200){  
            billToPay = 100 * 10 + (units - 100) * 20;  
        }  
        else if(units < 300){  
            billToPay = 100 * 10 + 100*15+ (units - 200) * 20;  
        }  
        else if(units > 300)  
        {  
            billToPay = 100 * 10 + 100 * 15 + 100*20 +(units - 300) * 25;  
        }  
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
    }   
}