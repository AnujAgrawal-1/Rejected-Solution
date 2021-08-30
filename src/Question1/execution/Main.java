package Question1.execution;


import Question1.defination.RollNumber;
import Question1.defination.RollNumberFetcher;
import Question1.defination.Student;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Anshu",new RollNumber(BigInteger.TEN)));
        studentList.add(new Student("Anuj",new RollNumber(BigInteger.ONE)));
        studentList.add(new Student("Rahul",new RollNumber(BigInteger.TWO)));
        System.out.println(new RollNumberFetcher().fetchRollNumbersList(studentList));
    }
}
