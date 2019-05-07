import java.util.PriorityQueue;

public class Aline{
    public static void main(String[] args){
        PriorityQueue<String> person = new PriorityQueue<>();
        person.add("a");
        person.add("b");
        person.add("c");
        person.add("d");
        person.add("e");

         while (!person.isEmpty()) {
            System.out.println(person.remove());
        }    

    }
}