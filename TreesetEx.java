
import java.util.TreeSet;
public class TreesetEx {
    public static void main(String[] args){
        TreeSet<String> names=new TreeSet<String>();
        names.add("Teju");
        names.add("Priya");
        names.add("Mouni");
        names.add("Ruchi");
        names.add("Teju");
        System.out.println("TreeSet:"+names);
        names.remove("Ruchi");
        System.out.println("Contains Priya:"+names.contains("Priya"));
        System.out.println("Size:"+names.size());
        System.out.println("Is Empty:"+names.isEmpty());
    }
}

