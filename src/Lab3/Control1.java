package Lab3;

import java.util.Scanner;

public class Control1 {
    public static void main(String[] args) {
        //if ->เป็นคำสั่งที่เลือกทำเมื่อมีเงื่อนไขเป็นจริงเท่านั้น
        //ใครสร้างคำสั่ง if
        //      if(เงื่อนไข) {
        //          คำสั่งของ if จะทำงานเมื่อเงื่อนไขเป็นจริง
        //      }

        int x = 10;
        if (x >= 50) {
            System.out.println("Yes");
        }
         System.out.println("Good bye.");

        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? : ");
        int age = sc.nextInt();
        if (age > 60) {
            System.out.print("you are old (คุณแก่แล้ว).");
        }



    }//main
}//Class
