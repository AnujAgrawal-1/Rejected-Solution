1. Complete the `fetchRollNumbersList()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.

   ```java
   class Student {
       private String name;
       private RollNumber rollNumber;
       // add the other necessary member methods here
   }
   class RollNumber {
       private final BigInteger rollNumber;
       // add the other necessary member methods here, A RollNumber object must always be immutable!
   }
   class RollNumberFetcher {
       public List<RollNumber> fetchRollNumbersList(List<Student> studentsList) {
           // TODO: COMPLETE THIS METHOD!
           return null;
       }
       // create a method to fetch a roll number from a single student object, and prepend the year of joining as 19, branch code as 150, then a 000, and then the roll number in the student object call it fetchRollNumberFromStudent
   }
   ```

   ---

2. Complete the `fetchNamesList()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.

   ```java
   class Student {
       private StudentName name;
       private BigInteger rollNumber;
       // add the other necessary member methods here
   }
   class StudentName {
       private String firstName;
       private String lastName;
       private String optionalMiddleName;
       // add the other necessary member methods here, the name of a student can or cannot have a middle name, so adjust
       // the toString() method accordingly!
   }
   class StudentNamesFetcher {
       public List<String> fetchNamesList(List<Student> studentsList) {
           // TODO: COMPLETE THIS METHOD!
           return null;
       }
       // create a method to prepend a "Ms." before the name if the name ends with an 'a', 'e', 'i', 'o' or 'u' (i.e is a female name (INDIAN)) otherwise prepend a "Mr."
   }
   ```

   ---

3. Complete the `fetchNamesOfFailedStudents()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions. 

   ```java
   class Student {
       private String name;
       private Grade grade;
       private Long fatherContactNumber;
       // add the other necessary member methods here
   }
   class Grade {
       private List<Double> marksInFiveSubjects;
       private char grade;
       // add the other necessary member methods here, grade must be immutable!
       // create a method to calculate the grade of a student from the marksInFiveSubjects list
       // if total marks is 100:'A', 99-90:'B', 89-80:'C', 79-70:'D', 69-60:'E', >=59:'F'
   }
   class StudentsRecords {
       public List<String> fetchNamesOfFailedStudents(List<Student> studentsList) {
           // TODO: COMPLETE THIS METHOD!
           return null;
       }
       // append the fatherContactNumber after the name with a comma and a space
       // ex - Divyansh, 123465789
   }
   ```

   ---

4. Complete the `fetchToppersList()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.

   ```java
   class Student {
       private String name;
       private Grade grade;
       // add the other necessary member methods here
   }
   class Grade {
       private List<Double> marksInFiveSubjects;
       private char grade;
       // add the other necessary member methods here
       // create a method to calculate the grade of a student from the marksInFiveSubjects list
       // if total marks is 100:'A', 99-90:'B', 89-80:'C', 79-70:'D', 69-60:'E', >=59:'F'
   }
   class StudentsRecords {
       public List<Student> fetchToppersList(List<Student> studentsList) {
           // TODO: COMPLETE THIS METHOD!
           return null;
       }
       // topper is a student who has scored at least a 'B' grade!
   }
   ```

   ---

5. Complete the `getEligibleVotersList()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.

   ```java
   class Person {
       private String name;
       private int age;
       // add the other necessary member methods here
   }
   class VoterList {
       public List<Person> getEligibleVotersList(List<Person> people) {
           // complete this method!
           return null;
       }
   }
   class Main {
       private static final int MAX_AGE = 100;
       public static void main(String[] args) {
           VoterList voterList2024 = new VoterList();
           System.out.println(voterList2024.getEligibleVotersList(createRandomPeopleList(100)));
       } // end of main
       private static List<Person> createRandomPeopleList(int numberOfPeople) {
           List<Person> randomPeopleList = new ArrayList<>();
           // write code to create new people and add it to the list!
           return randomPeopleList;
       }
       private static int getRandomAge() {
           return Math.abs(new Random().nextInt() % MAX_AGE);
       }
       private static String getRandomName() {
           // create a String array of first names of people and return a random name from the array!
       }
   }
   ```

   ---

6. Complete the `getCompaniesInLocation()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.  

   ```java
   class Company {
       private String name;
       private Address address;
       // add the other necessary member methods here
   }
   class Address {
       private String address;
       // add the other necessary member methods here, address should be immutable!
   }
   class CompanyLister {
       public List<String> getCompaniesInLocation(List<Company> companies, String location) {
           // complete this method!
           return null;
       }
       public List<Company> createFakeCompanies(int number) {
           List<Company> fakeCompaniesList = new ArrayList<>();
           // complete this method!
           return fakeCompaniesList;
       }
   }
   ```

   ---

7. Complete the `getCurrentlyHiringCompanies()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.

   ```java
   class Company {
       private String name;
       private List<Vacancy> numberOfVacancies;
       // add the other necessary member methods here!
   }
   class Vacancy {
       private String jobName;
       private double Salary;
       // write a separate helper method to add random technologies to a vacancy object.
       private List<String> technologiesRequired;
       // add the other necessary member methods here, job name and salary should be immutable!
   }
   class CompanyLister {
       public List<Company> getCurrentlyHiringCompanies(List<Company> allCompanies) {
           // complete this method!
           return null;
       }
       public List<Company> createFakeCompanies(int number) {
           List<Company> fakeCompaniesList = new ArrayList<>();
           // complete this method!
           return fakeCompaniesList;
       }
   }
   ```

   ---

8. Complete the `getCompaniesThatMadeMoreProfitThan()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.

   ```java
   class Company {
       private String name;
       private EconomicProfile economicProfile;
       // add the other necessary member methods here!
   }
   class EconomicProfile {
       private double totalEarningsInRupees;
       private double totalExpenditureInRupees;
       private double totalProfitInRupees;
       // add the other necessary member methods here, a economic profile object should be immutable!
   }
   class CompanyLister {
       public List<Company> getCompaniesThatMadeMoreProfitThan(List<Company> allCompanies, double profitAmount) {
           // complete this method!
           return null;
       }
       public List<Company> createFakeCompanies(int number) {
           List<Company> fakeCompaniesList = new ArrayList<>();
           // complete this method!
           return fakeCompaniesList;
       }
   }
   ```

   ---

9. Complete the `getDeveloperByTechnology()` method and execute it in a separate "execution" class.

   Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

   **BONUS** points for:

   1. successfully adding a `Comparator/Comparable` to the definition classes.
   2. Using lambda expressions/method references and/or streams and/or regular expressions.

   ```java
   class Company {
       private String name;
       private List<Developer> developers;
       // add the other necessary member methods here!
   }
   class Developer {
       private int employeeID;
       private String name;
       private List<String> knownTechnologies;
       // add the other necessary member methods here, only employeeID and name should be immutable!
   }
   class CompanyLister {
       public List<Developer> getDeveloperByTechnology(List<Company> allCompanies, String technologyName) {
           // complete this method!
           return null;
       }
       public List<Company> createFakeCompanies(int number) {
           List<Company> fakeCompaniesList = new ArrayList<>();
           // complete this method!
           return fakeCompaniesList;
       }
   }
   ```

   ---

10. Complete the `numberOfNewSubscribers()` method and execute it in a separate "execution" class.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Video {
        private String title;
        private int numberOfLikes;
        private List<Subscriber> subscriberList;
        // add the other necessary member methods here! title must be immutable
    }
    class Subscriber {
        private String name;
        private boolean isNewSubscriber;
        // add the other necessary member methods here! name must be immutable
    }
    class VideoAnalyzer {
        public int[] numberOfNewSubscribers(List<Video> videoList) {
            // return the number of new subscribers in every video in an array!
            return null;
        }
        public Subscriber createFakeSubscriber() {
            // complete this method!
            return null;
        }
    }
    ```

    ---

11. Complete the `findTrain()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class TrainFinder {
        public List<Train> findTrain(Location from, Location to) throws NoTrainFoundException {
            // complete this method
            return null;
        }
        public List<Train> createListOfFakeTrains(int number) {
            // complete this method
            return null;
        }
    }
    class Train {
        private int trainNumber;
        private Location from;
        private Location to;
        // add the other necessary member methods here! to and from must be immutable!
        
    }
    class Location {
        private int locationID;
        private String name;
        // add the other necessary member methods here! locationID must be immutable!
    }
    ```

    ---

12. Complete the `findNumberOfSeatsInTrain()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Train {
        private int trainNumber;
        private List<Coach> coaches;
        // add the other necessary member methods here! trainNumber must be immutable
    }
    class Coach {
        private int coachNumber;
        private int numberOfSeats;
        // add the other necessary member methods here! numberOfSeats must be immutable
    }
    class TicketSeatHelper {
        /**
         * @throws InvalidTrainException if the number of seats in train is less than 10.
         * */
        public int findNumberOfSeatsInTrain(Train train) throws InvalidTrainException {
            // complete this method
            return 0;
        }
        public Train createFakeTrain() {
            // complete this method
            return null;
        }
    }
    ```

    ------

13. Complete the `getPassengerListWaitingForSeat()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Train {
        private int trainNumber;
        private int numberOfVacantSeats;
        // add the other necessary member methods here! trainNumber must be immutable
    }
    class Seat {
        private Train train;
        private String seatNumber;
        // add the other necessary member methods here! seatNumber must be immutable
    }
    class Passenger {
        private int passengerID;
        private int ticketNumber;
        private Seat seat;
        // add the other necessary member methods here! ticketNumber and seat must be immutable
    }
    class TicketHelper {
        public List<Passenger> getPassengerListWaitingForSeat(Seat seat) throws NoSuchPassengersException {
            // complete this method
            return null;
        } 
    }
    ```

    ------

14. Complete the `getListOfTrainsAtStation()` method and execute it in a separate "execution" class. class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Train {
        private int trainNumber;
        private String name;
        // add the other necessary member methods here, trainNumber must be immutable
    }
    class Station {
        private int stationNumber;
        private String name;
        private Set<Train> inComingTrains;
        // add the other necessary member methods here, stationNumber must be immutable and
        // the set of inComingTrains must also be non-modifiable
    }
    class StationStatusChecker {
        public List<Train> getListOfTrainsAtStation(Station station) throws NoTrainsIncomingException {
            // complete this method
            return null;
        }
    }
    ```

    ------

15. Complete the `checkIfMobileIsAvailable()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Mobile {
        private int id;
        private String name;
        private double price;
        private MobileManufacturer manufacturer;
        // add the other necessary member methods here! price and manufacturer must be immutable!
    }
    class MobileManufacturer {
        private int id;
        private String companyName;
        // add the other necessary member methods here! the companyName must be immuatable!
    }
    class MobileShop {
        public int checkIfMobileIsAvailable(HashMap<Mobile, Integer> mobilesInStock, int mobileID) throws NoSuchMobileException {
            // complete this method!
            return 0;
        }
        public Mobile[] createArrayOfFakeMobiles() {
            // complete this method!
            return null;
        }
    }
    ```

    ------

16. Complete the `getListOfSpoiltBrats()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Billionaire {
        private String name;
        private double netWorthInRupees;
        private double moneyDonatedToCharityInRupees;
        // add the other necessary member methods here
    }
    class PersonalityChecker {
        public List<RichBrat> getListOfSpoiltBrats(Set<Billionaire> billionaires) throws NotEnoughMoneyException {
            // if moneyDonatedToCharityInRupees <= 0 then the billionaire is a spoilt brat!
            // make that billionaireNice by donating 1_00_00_00_000 rupees on their behalf!
            return 0;
        }
    }
    class RichBrat extends Billionaire {
        // add the necessary member fields/methods here
        // create a method to count the money spent after deduction 
    }
    ```

    ------

17. Complete the `numberOfRunnableProcesses()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Laptop {
        private String name;
        private double batteryLeftPercentage;
        // add the other necessary member methods here, name must be immutable
    }
    class Process {
        private int processID;
        private double batteryPercentageRequiredToRun;
        // add the other neccessary member methods here, processID must be immutable
    }
    class LaptopBatteryChecker {
        public static int numberOfRunnableProcesses(Set<Process> processes) throws NotEnoughBatteryLeftException {
            // complete this method, throw exception where there is not enough battery to run less than 5 process from the set
            return 0;
        }
    }
    ```

    ------

18. Complete the `getPurchasableLaptops()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Laptop {
        private String name;
        private double price;
        private RAM ram;
        // add the other necessary member methods here, price and ram must be immutable
    }
    class RAM {
        private int ramCapacityInGB;
        private String ramClass; // DDR3, DDR4, DDR5, DDR6, GDDR6
        // add the other necessary member methods here, ramClass must be immutable
    }
    class LaptopShopper {
        /**
         * count only those laptops as purchasable whose RAM > 8GB and class >= DDR3
         * @throws NotEnoughMoneyException
         */
        public HashMap<Laptop, Double> getPurchasableLaptops(List<Laptop> laptopList) throws NotEnoughMoneyException {
            // complete this method
            return null;
        }
    }
    ```

    ------

19. Complete the `getButtonsNotWorking()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class KeyboardButton {
        private char character;
        private boolean isWorking;
        // add the other necessary member methods here, character must be immutable!
    }
    class KeyBoardChecker {
        public Set<Character> getButtonsNotWorking(List<KeyboardButton> buttons) throws IllegalCharacterException {
            // complete this method
            return null;
        }
    }
    ```

    ------

20. Complete the `createTeam()` method and execute it in a separate "execution" class. Create the required custom exception that is mentioned in the code.

    Other necessary member methods are - the `equals()` method, the `hashCode()` method, the `toString()` method, and of course a constructor, getter and setter methods.

    **BONUS** points for:

    1. successfully adding a `Comparator/Comparable` to the definition classes.
    2. Using lambda expressions/method references and/or streams and/or regular expressions.

    ```java
    class Company {
        private String name;
        private List<Developer> developers;
        // add the other necessary member methods here!
    }
    class Developer {
        private String name;
        private List<String> knownTechnologies;
        private double salary;
        // add the other necessary member methods here, name must be immutable, knownTechnologies must be mutable
    }
    class CompanyHelper {
        // there must be only 4 developers in a team whose technologies must not be the same! 
        public Set<Developer> createTeam(List<Developer> developers) throws NoDiversityException {
            // complete this method
            return null;
        }
        public List<Company> createFakeCompanies(int number) {
            List<Company> fakeCompaniesList = new ArrayList<>();
            // complete this method!
            return fakeCompaniesList;
        }
    }
    ```

    ------
