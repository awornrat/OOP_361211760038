package Lab3;

public class LoopFor {
    public static void main(String[] args) {
        //loop for : ใช้ในกรณีที่ทราบจำนวนรอบการทำซ้ำที่ชัดเจน
        //โครงสร้าง for

        // for(ค่าเริ่่มต้น; เงื่อนไข; ปรับปรุงค่าตัวนับ){
        //      คำสั่งเงื่อนไขเป็นจริง;
        // }

        for (int i = 0; i < 20; i++) {
            System.out.println("Hello");
            if (i%2 ==0)
                System.out.print("RUTS");
        }
    }
}
