
import java.util.TreeSet;

public class Studentmg {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<Integer>();

        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75);
        marks.add(80);

        System.out.println("TreeSet: " + marks);

        System.out.println("Lowest Mark: " + marks.first());
        System.out.println("Highest Mark: " + marks.last());

        marks.remove(65);

        System.out.println("Contains 90: " + marks.contains(90));
        System.out.println("TreeSet: " + marks);
    }
}