
import java.util.HashSet;
public class HashsetEx {
    public static void main(String[] args){
        HashSet<String> names=new HashSet<String>();
        names.add("Teju");
        names.add("Priya");
        names.add("Mouni");
        names.add("Ruchi");
        System.out.println("HashSet:"+names);
        names.remove("Ruchi");
        System.out.println("Contains Priya:"+names.contains("Priya"));
        System.out.println("Size:"+names.size());
        System.out.println("Is Empty:"+names.isEmpty());
    }
}
