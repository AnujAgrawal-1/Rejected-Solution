package Question1.defination;

import java.util.Objects;

public class Student {
    private String name;
    private RollNumber rollNumber;
    // add the other necessary member methods here

    public Student(String name, RollNumber rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RollNumber getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(RollNumber rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
