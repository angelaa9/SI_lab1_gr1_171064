import java.util.*;
public class Course {

    public static void main(String[] args)
    {
        List<Student> ll = new LinkedList<>();
        ll.add("NewStudent1");
        ll.add("NewStudent2");
        ll.add("NewStudent3");
        ll.add("NewStudent4");
        ll.add("NewStudent5");
        ll.remove("NewStudent1");

        System.out.println(ll);
    }
}