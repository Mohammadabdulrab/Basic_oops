package firstmain;

public class Student {
    int studentId;
    String name;
    String dob;
    String email;
    String gender;
    String grade;
// toString method is used
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }


    public Student(){

    }
    public Student(int studentId, String name, String dob, String email, String gender, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.grade = grade;
    }
}
