package Lab8;

public class Student extends Person{
    private String stdID;
    private String progrom;


    public Student(String id, String name,String stdID,String progrom) {
        super(id, name);
        this.stdID = stdID;
        this.progrom = progrom;
    }
    //getter and setter

    public String getStdID() {
        return stdID;
    }

    public String getProgrom() {
        return progrom;
    }

    public void setProgrom(String progrom) {
        this.progrom = progrom;
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "stdID='" + stdID + '\'' +
                ", progrom='" + progrom + '\'' +
                '}';
    }
}
