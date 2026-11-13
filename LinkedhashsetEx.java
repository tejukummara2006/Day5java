
import java.util.LinkedHashSet;
public class  LinkedhashsetEx {
    public static void main(String[] args){
        LinkedHashSet<String> names=new LinkedHashSet<String>();
        names.add("Teju");
        names.add("Priya");
        names.add("Mouni");
        names.add("Ruchi");
        System.out.println("LinkedHashSet:"+names);
        names.remove("Ruchi");
        System.out.println("Contains Priya:"+names.contains("Priya"));
        System.out.println("Size:"+names.size());
        System.out.println("Is Empty:"+names.isEmpty());
    }
}
