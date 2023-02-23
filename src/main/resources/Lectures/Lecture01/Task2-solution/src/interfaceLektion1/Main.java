package interfaceLektion1;
// Lektion 1: Interface

import java.io.*;
import java.util.*;

import interfaceLektion1.IStak.StakEmptyException;

public class Main {

      public static void main(String[] args) throws StakEmptyException{

        int valg = 0;
        Scanner scan = new Scanner(System.in);

        while (valg != 3){
            System.out.println( "MENU TEST STACK");
            System.out.println( "Test stack implemented as array: 1");
            System.out.println( "Test stack implemented as list: 2");
            System.out.println( "EXIT: 3");
            System.out.print( "Enter option:");
            valg = scan.nextInt();
            switch (valg) {
                case 1:  {
                    System.out.println("hvor mange elementer?" );
                    int str= scan.nextInt();
                    IStak s = new ArrayStak(str);
                    s.push("Dette");
                    s.push(" er");
                    s.push(" en");
                    // s.show();
                    s.push(" mærekelig");
                    s.push(" sætning");
                    s.show();
                    for (int i= 0; i < 5; i++)
                        System.out.println(s.pop());
                }
                break;
                case 2:  {
                    IStak s = new LinkedStak();
                    s.push("Dette");
                    s.push(" er");
                    s.push(" en");
                    // s.show();
                    s.push(" mærekelig");
                    s.push(" sætning");
                    s.show();
                }
                break;
                case 3:  System.out.println("Bye");
                    break;
                default: System.out.println("Ugyldigt tal");
                    break;
            }
        }
        scan.close();
    }
}