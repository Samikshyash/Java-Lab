package Encapsulation;

public class StudentInfo {
    private String name;
    private int roll;
    private float marks;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;

    }

    public int getRoll() {
        return roll;
    }

    public void setMarks(float marks) {
        this.marks = marks;

    }

    public float getMarks() {
        return marks;
    }

}

class Main {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();

        s1.setName("Samikshya");
        s1.setRoll(33);
        s1.setMarks(95);

        System.out.println(
                "Name: " + s1.getName() +
                        ", Roll: " + s1.getRoll() +
                        ", Marks: " + s1.getMarks());
    }
}
