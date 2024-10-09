/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NOTGENERICSContainerArrayProgram;

import java.util.Scanner;

/**
 *
 * @author liz10
 */
public class Maiin {

    public static void main(String[] args) {
        int max;
        String inputData;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a String (use spaces to separate strings): ");
        inputData = scan.nextLine();
        EthanHourihanContainer ethan = new EthanHourihanContainer(inputData);
        ethan.setArray();

        max = ethan.getMax();
        for (int i = 0; i < max; i++) {
            ethan.setPosition(i);
            System.out.println("Position "+i + ": " + ethan.getData());
        }

    }

}
