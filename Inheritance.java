import java.util.Arrays;
import java.util.Objects;

public class Inheritance {
    public static void main(String[] args) {

    }
}

class Person{
    private String firstName;
    private String lastName;
    private String gender;

    public Person(){

    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    public boolean equals(Person p){
        if(p.getFirstName().equals(this.getFirstName()) && p.getLastName().equals(this.getLastName()) && p.getGender().equals(this.getGender())){
            return true;
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Teacher extends Person{

    // toString() is inherited from super

    private String department;
    private String[] courses;

    public Teacher(String department, String[] courses) {
        this.department = department;
        this.courses = courses;
    }

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public Teacher() {
    }


    public boolean equals(Teacher t){
        boolean result = super.equals(t) && this.getDepartment().equals(t.getDepartment());
        result = result && Arrays.equals(this.getCourses(), t.getCourses());
        return result;
    }

}

class Student extends Person{

    //toString() is inherited from super
    private int studentId;

    public Student(){

    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public boolean equals(Student s){
        return super.equals(s) && (this.getStudentId() == s.getStudentId());
    }
}

class PhdStudent extends Student{

    //toString() is inherited from super
    String department;
    String[] courses;

    public boolean equals(PhdStudent pStud){
        return super.equals(pStud) && (this.getDepartment().equals(pStud.getDepartment())) && (Arrays.equals(this.getCourses(), pStud.getCourses()));
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public PhdStudent(){}
    public PhdStudent(String department, String[] courses) {
        this.department = department;
        this.courses = courses;
    }

    public PhdStudent(int studentId, String department, String[] courses) {
        super(studentId);
        this.department = department;
        this.courses = courses;
    }

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }
}