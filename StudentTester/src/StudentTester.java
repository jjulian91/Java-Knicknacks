public class StudentTester {

    /*
Question 6: Undergraduate Student Part B- Driver
Write code that would go inside of the StudentTester class
1.Add some UndergraduateStudents to the array.
2.loop through the theStudents array
3.count how many undergraduate students owe tuition.
 */

    public static void main(String[] args) {

        UndergraduateStudent[] theStudents;
        theStudents = new UndergraduateStudent[3];


        theStudents[0] = new UndergraduateStudent(
                "Daniel","Haim",555,true);
        theStudents[1] = new UndergraduateStudent(
                "Daniel","Haim",777,false);
        theStudents[2] = new UndergraduateStudent(
                "Daniel","Haim",111,false);

        int oweTuition = 0;
        for(Object st:theStudents) {
            if(st instanceof UndergraduateStudent) {
                UndergraduateStudent temp = (UndergraduateStudent) st;
                if (temp.isTuitionPaid()==false){
                    oweTuition++;
                }
            }

        }
        System.out.println(oweTuition);

    }

}

class UndergraduateStudent extends Student {

    /*Question 5: UndergraduateStudent Part A
    1.Write a class called UndergraduateStudent that,
    2.inherits from the Student class.
    3.An undergraduate student is a student that also has instance data to represent whether or not tuition is paid.
    4.1 Write the class header,
    4.2 constructor
    4.3 getters
    4.4 setters
    4.5 updated toString method.
    */

    boolean tuitionPaid;

    public UndergraduateStudent(String firstName, String lastName, int studentID, boolean inputTuitionPaid) {
        super(firstName, lastName, studentID);
        tuitionPaid = inputTuitionPaid;
    }

    public boolean isTuitionPaid() {
        return tuitionPaid;
    }

    public void setTuitionPaid(boolean tuitionPaid) {
        this.tuitionPaid = tuitionPaid;
    }

    @Override
    public String toString() {
        String output;
        output = super.toString()+
                "Tuition payment status"+Boolean.toString(tuitionPaid);
        return output;
    }
}

class Student implements Comparable<Student> {

    private String firstName, lastName;
    private int studentID;

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setStudentID(int studentID) {
        if(studentID >=0 && studentID <= 9999) {
            this.studentID = studentID;
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " (" + studentID + ")";
    }

    @Override
    public int compareTo(Student other) {
		/*
		if(studentID < other.studentID) {
			return -1;
		} else if(studentID > other.studentID) {
			return 1;
		} else { // the IDs are equal
			assert studentID == other.studentID;
			return 0;
		}
		*/
        return Integer.compare(studentID, other.studentID);
    }

    /*
    @Override
    public int compareTo(Student other) {
        if(lastName.compareTo(other.lastName)==0) { // last names are the same
            return firstName.compareTo(other.firstName);
        } else { // last names are different
            return lastName.compareTo(other.lastName);
        }

    }
    */
    @Override
    public boolean equals(Object other) {
        if(other instanceof Student) {
            Student otherStudent = (Student) other;

            return this.studentID == otherStudent.studentID;
        } else {
            return false;
        }

    }
}