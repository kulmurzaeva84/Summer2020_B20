package day18_ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //Scanner scan= new Scanner(System.in);
        //  String name = "Jika";

        for (int a = 0; a < 50; a++) {
            System.out.println("Jika");
        }
        for (int i = 1; i <= 5; ++i) {
            System.out.println("Cybertek Batch 20");
        }
        for (int i = 1; i <= 10; ++i) {
            System.out.print(i + " ");// =>1 2 3 4 5 6 ...
            // System.out.print(i);
        }
        System.out.println("================================");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");


        }



    }
}