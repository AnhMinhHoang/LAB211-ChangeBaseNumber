/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> list = new ArrayList();
    
    public Menu(String title, String[] mc){
        this.title = title;
        for(String item: mc){
            list.add((T)item);
        }
    }
    
    public Menu(){}
    
    public void display(){
        System.out.println("-------------------------");
        System.out.println(title);
        System.out.println("-------------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.println((i+1)+"-"+list.get(i));
        }
        System.out.println("-------------------------");
    }
    
    public int getChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your selection: ");;
        return sc.nextInt();
    }
    
    public abstract void execute(int choice);
    
    public void run(){
        int choice;
        do{
            display();
            try{
                choice = getChoice();
            }
            catch(Exception e){
                choice = list.size()+1;
            }
            System.out.println("-------------------------");
            execute(choice);
        }
        while(choice != list.size());
    }
}
