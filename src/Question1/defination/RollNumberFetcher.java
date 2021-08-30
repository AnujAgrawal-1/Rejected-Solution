package Question1.defination;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RollNumberFetcher {
    public List<RollNumber> fetchRollNumbersList(List<Student> studentsList) {
        // TODO: COMPLETE THIS METHOD!
        List<RollNumber> rollNumberList = new ArrayList<>();
        //        for(Student s :studentsList){
        //            rollNumberList.add(new RollNumber(new BigInteger("19150000"+s.getRollNumber().getRollNumber())));
        //        }

        /**
         * Using Stream API
         * 1.*/
        return studentsList.stream().map(Student::getRollNumber).
                map(rollNumber -> new RollNumber(new BigInteger("19150000"+rollNumber.getRollNumber())))
                .sorted().collect(Collectors.toList());



    }
    // create a method to fetch a roll number from a single student object,
    // and prepend the year of joining as 19, branch code as 150,
    // then a 000, and then the roll number in the student object call it fetchRollNumberFromStudent
}
