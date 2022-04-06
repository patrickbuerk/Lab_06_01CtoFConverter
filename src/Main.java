import java.util.Scanner;
 class Main {


     public static void main(String[] args)
     {


         double celsiusTemperature = 0;
         String trash ="";

         Scanner in = new Scanner(System.in);
                 System.out.println("Enter the temperature in Celsius: ");
         if(in.hasNextDouble()) {
             //should read as double only
             celsiusTemperature = in.nextDouble();
             in.nextLine();
             double fTemp = (celsiusTemperature * 9/5) +32;
             System.out.println(fTemp);
         }
         else{
             trash = in.nextLine();
             System.out.println("You did not enter a valid number for Celsius the number you entered was: "+ trash );
         }








     }











}
