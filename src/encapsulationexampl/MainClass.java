package encapsulationexampl;

public class MainClass {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStudentId(11);
        s1.setName("Abdul");
        s1.setDob("01/06/1999");
        s1.setEmail("abdulrab123@gmail.com");
        s1.setGender("male");
        s1.setGrade("B Tech");

        System.out.println("s1 is after set the values:"+s1);

        // if we want to print the particular values  the we will use the getter

        System.out.println("name of s1 is:"+s1.getName());
        System.out.println("email of s1 is:"+s1.getEmail());
    }
}
