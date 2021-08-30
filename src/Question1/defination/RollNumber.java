package Question1.defination;

import java.math.BigInteger;
import java.util.Objects;

public class RollNumber implements Comparable<RollNumber> {
    private final BigInteger rollNumber;
    // add the other necessary member methods here, A RollNumber object must always be immutable!

    public RollNumber(BigInteger rollNumber) {
        this.rollNumber = rollNumber;
    }

    public BigInteger getRollNumber() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RollNumber that = (RollNumber) o;
        return Objects.equals(rollNumber, that.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    @Override
    public String toString() {
        return "RollNumber :" + rollNumber;
    }
    @Override
    public int compareTo(RollNumber o) {
        return this.rollNumber.compareTo(o.rollNumber);
    }
}
