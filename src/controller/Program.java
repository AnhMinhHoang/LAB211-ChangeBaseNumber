/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Input;
import model.NumberSystem;
import view.Menu;

/**
 *
 * @author GoldCandy
 */
public class Program extends Menu {

    Algorithm algorithm;
    Input input;
    static String[] mc = {"Binary", "Decimal", "HexaDecimal", "Exit"};
    
    public Program() {
        super("NUMBER CHANGER", mc);
        algorithm = new Algorithm();
        input = new Input();
    }
    
    @Override
    public void execute(int choice) {
        int a;
        String s;
        switch (choice) {
            case 1: {
                s = input.binInput("Enter binary number");
                String[] tt = {"Decimal", "HexaDecimal", "Exit"};
                Menu menu = new Menu("CHANGE TO", tt) {
                    @Override
                    public void execute(int choice) {
                        switch (choice) {
                            case 1: {
                                System.out.println(algorithm.binToDeci(s));
                                break;
                            }
                            case 2: {
                                System.out.println(algorithm.binToHexa(s));
                                break;
                            }
                            case 3: {
                                break;
                            }
                            default: {
                                System.out.println("No such choice!");
                                break;
                            }
                        }
                    }
                };
                menu.run();
                break;
            }
            case 2: {
                a = input.deciInput("Enter decimal number");
                String[] tt = {"Binary", "HexaDecimal", "Exit"};
                Menu menu = new Menu("CHANGE TO", tt) {
                    @Override
                    public void execute(int choice) {
                        switch (choice) {
                            case 1: {
                                System.out.println(algorithm.deciToBin(a));
                                break;
                            }
                            case 2: {
                                System.out.println(algorithm.deciToHexa(a));
                                break;
                            }
                            case 3: {
                                break;
                            }
                            default: {
                                System.out.println("No such choice!");
                                break;
                            }
                        }
                    }
                };
                menu.run();
                break;
            }
            case 3: {
                s = input.hexaInput("Enter hexadecimal number");
                String[] tt = {"Binary", "Decimal", "Exit"};
                Menu menu = new Menu("CHANGE TO", tt) {
                    @Override
                    public void execute(int choice) {
                        switch (choice) {
                            case 1: {
                                System.out.println(algorithm.hexaToBin(s));
                                break;
                            }
                            case 2: {
                                System.out.println(algorithm.hexaToDeci(s));
                                break;
                            }
                            case 3: {
                                break;
                            }
                            default: {
                                System.out.println("No such choice!");
                                break;
                            }
                        }
                    }
                };
                menu.run();
                break;
            }
            case 4: {
                System.out.println("EXIT PROGRAM...");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("No such choice!");
                break;
            }
        }
    }
}
