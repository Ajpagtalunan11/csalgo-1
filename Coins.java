package pesobills;

import java.util.*;

public class PesoBills {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        double value;
        double ten;
        double five;
        double peso;
        double cents;
        
        
        System.out.print("Enter value: ");
        value = scan.nextDouble();
        
        if(value > 10)
        {
            ten = (int)value / 10;
            System.out.println("Tens: "+ten );
            value %= 10;
        }if(value > 5){
            five = (int) value / 5;
            System.out.println("Five: " +five);
            value %= 5;
        }if(value >1){
             peso = (int) value / 1;
            System.out.println("Peso: " +peso);
            value %= 1;
        }if(value > .25){
            cents =  value / .25;
        System.out.println("Cents: " +cents);
  
    }
    }
}
 
