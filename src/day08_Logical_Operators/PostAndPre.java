package day08_Logical_Operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */
public class PostAndPre {
    public static void main(String[] args) {
        int a = 200; // a = 201; 200; 199;
        int b = -a++ + - --a * a-- % 2;
       // b = ?
        // -200 + -200 * 200%2
        // b = -200 -40000%2
        // -200 -0 = -200
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y; // 0.75
        // z = 300 + 400 - 120000 + 0 = -119300
        System.out.println(z);



    }



}
