package firstmain;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Everyone welcome to spring boot class!");

        Student s1=new Student();
        System.out.println("s1 is"+s1);

        s1.studentId=123;
        s1.name="Mohammad Abdul Rab";
        s1.dob="01/06/1999";
        s1.email="abdulrab@123gmail.com";
        s1.gender="male";
        s1.grade="B Tech";

        System.out.println("s1 is after initializing the valiues : "+s1);


        Student s2=new Student(786,"naseem","09/04/2002","naseemturk123@gmail.com","male","MLT");
        System.out.println("s2 after initializing from  parameterize constructor :" +s2);
    }
}
