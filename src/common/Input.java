/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author GoldCandy
 */
public class Input {
    public int deciInput(String title){
        Scanner sc = new Scanner(System.in);
        String s;
        int a = -1;
        while(true){
            System.out.print(title+": ");
            try{
                s = sc.nextLine();
                a = Integer.parseInt(s);
                if(a >= 0) break;
            }
            catch(NumberFormatException e){
                System.err.println("Enter number(>0)");
            }
        }
        return a;
    }
    
    public String binInput(String title){
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.print(title+": ");
            s = sc.nextLine();
            if(s.matches("[01]+")) break;
        }
        return s;
    }
    
    public String hexaInput(String title){
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.print(title+": ");
            s = sc.nextLine();
            if(s.matches("[0-9A-F]+")) break;
        }
        return s;
    }
}
