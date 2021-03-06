package Lab6;

public class exString {
    // String เป็นข้อมูลชนิดข้อมความ แต่ในภาษาจาวา String เป็นคลาส
    // ดังนั้นการประกาศตัวแปรชนิด String (ประกาศเป็น Object ของคลาส)
    // จึงสามารถเรียกใช้เมธอคต่างๆ ที่อยู่ในคลาส String ได้
    public static void main(String[] args) {
        String msg = "Hello, SaiYai !!!";

        //length() ใช้ในการนับจำนวนตัวอักษรในข้อความ ส่งค่ากลับมาเป็นจำนวนเต็ม (int)
        int len = msg.length();
        System.out.println();

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.charAt(5)); //แสดงตัวอักษรที่ตำแหน่ง 5 ของข้อความ

        // concatenating String คือ การต่อข้อความ
        //1. ใช้เครื่องหมาย +
        String msg2 = "RUTS";
        String msgCon = msg + msg2;
        System.out.println(msgCon);
        //2. ใช้ concat()
        String msgCon2 = msg.concat(msg2);
        System.out.println(msgCon2);

        //Compare String คือ การเปรียบเทียบข้อความ 2 ข้อความ
        String m1 = "SaiYai RUTS";
        String m2 = "SaiYai";

        //1. ใช้เครื่องหมาย == เหมือนกันเป็น true ต่างกัน false
        if (m1 == m2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(m1==m2? "Yes":"No");

        //2. equals()
        if (m1.equals(m2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(m1.equals(m2)? "Yes":"No");

        //3. compareTo() ถ้าข้อความเป็น 0, ข้อความทางซ้ายมากกว่าเป็น 1, ข้อความทางขวามากกว่าเป็น -1


        int x = m1.compareTo(m2);
        System.out.println(x);



    }//main
}//class

