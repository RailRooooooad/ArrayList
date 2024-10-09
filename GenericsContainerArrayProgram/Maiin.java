/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericsContainerArrayProgram;

import java.util.Scanner;

/**
 *
 * @author liz10
 */
public class Maiin 
{

    public static void main(String[] args) 
    {
        int intInput;
        double doubleInput;
        String stringInput;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How big should the array be?");
        int arraySize = scan.nextInt();
        
        var list = new EthanHourihanContainer<>(arraySize);
        
        for(int i = 0; i < arraySize; i++)
        {
        
            System.out.println("What data type would you like to use for your input? (1 int, 2 double, 3 String)");
            int choose = scan.nextInt();

            
            System.out.println("Type what you want to add to the array:");
            switch(choose)
            {
                case 1:
                    intInput = scan.nextInt();
                    list.add(intInput);
                    break;
                case 2: 
                    doubleInput = scan.nextDouble();
                    list.add(doubleInput);
                    break;
                case 3:
                    stringInput = scan.nextLine();
                    list.add(stringInput);
                    break;                   
                    
            }    
            
            //list.add(input);
            
        }
        
        
        //list.add("Hello There");        
        String number = (String) list.get(0);  //WRONG
        
        System.out.println("Item: "+ number); //WRONG
        
        
        scan.close();
    }

}
