package Lab8;

public class PersonApp {

    public static void main(String[] args) {
        //create object
        Student std1 = new Student("1234567891234","ksnyanat Thaioon",
                "STD00123","Information Technology");
        Person p1 = new Person("2345678912345","Patharapong Promhom");

        System.out.println(std1.getName());
        System.out.println(p1.getName());
    }
}
