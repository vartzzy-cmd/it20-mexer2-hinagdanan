import java.util.LinkedList;
import java.util.Queue;

public class StudentQueue {
    public static void main(String[] args) {

        Queue<String> students = new LinkedList<>();
      
        students.offer("Ana");
        students.offer("Ben");
        students.offer("Carla");
        
        System.out.println("Serving: " + students.poll());

        
        students.offer("David");

        
        System.out.println("Updated Service Order:");

        while (!students.isEmpty()) {
            System.out.println("Serving: " + students.poll());
        }
    }
}
