public class Main {
    public static void main(String[] args) {
        String[] teacherCourses = {"OOP", "Data Structures"};
        Teacher t1 = new Teacher("Jeyhun", "Naghiyev", "Male", "Computer Science", teacherCourses);
        Student s1 = new Student("Hasan", "Naghiyev", "Computer Science", "S12345");
        String[] phdCourses = {"AI", "Machine Learning"};
        PhdStudent p1 = new PhdStudent("Ali", "Naghiyev", "Male", "P98765", "Computer Science", phdCourses);
        System.out.println(t1);
        System.out.println(s1);
        System.out.println(p1);
        Student s2 = new Student("Murad", "Naghiyev", "Male", "S12345");
        System.out.println("s1 equals s2: " + s1.equals(s2));
    }
}