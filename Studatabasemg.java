
import java.util.HashMap;
public class Studatabasemg{
    public static void main(String[] args){
    HashMap<Integer,String> students=new HashMap<Integer,String>();
    students.put(101,"Teju");
    students.put(102,"Mouni");
    students.put(103,"Ruchi");
    students.put(104,"Chandhu");
    students.put(105,"Priya");
    System.out.println("HashMap:"+students);
    System.out.println("Student 102:"+students.get(102));
    students.put(103,"Pravallika");
    students.remove(105);
    System.out.println("Contains Key 101:"+students.containsKey(101));
    System.out.println("Contains Value Teju:"+students.containsValue("Teju"));
    System.out.println("student Id:"+students.keySet());
    System.out.println("student values:"+students.values());
    }
}
