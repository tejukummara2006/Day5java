
import java.util.HashSet;
public class Employeemg {
    public static void main(String[] args){
        HashSet<Integer> id=new HashSet<Integer>();
        id.add(101);
        id.add(102);
        id.add(103);
        id.add(104);
        id.add(105);
        id.add(106);
        id.add(107);
        id.add(108);
        id.add(109);
        id.add(110);
        id.add(120);
        System.out.println("HashSet:"+id);
        id.remove(103);
        System.out.println("Contains 105:"+id.contains(105));
        System.out.println("Size:"+id.size());
        System.out.println("Is Empty:"+id.isEmpty());
        System.out.println("HashSet:"+id);
    }
}
