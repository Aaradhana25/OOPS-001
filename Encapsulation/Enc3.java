class Student {
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Enc3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setName("Aaradhana");

        System.out.println("Student Roll No: " + s.getRollNo());
        System.out.println("Student Name: " + s.getName());
    }
}
