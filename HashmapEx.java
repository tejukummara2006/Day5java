import java.util.HashMap;
public class HashmapEx {
    public static void main(String[] args){
    HashMap<Integer,String> students=new HashMap<Integer,String>();
    students.put(101,"John");
    students.put(102,"Alice");
    students.put(103,"David");
    students.put(104,"Robert");
    System.out.println("HashMap:"+students);
    System.out.println("Student 101:"+students.get(101));
    students.put(102,"Petter");
    students.remove(103);
    System.out.println("Contains Key 101:"+students.containsKey(101));
    System.out.println("Contains Value John:"+students.containsValue("John"));
    System.out.println("Size:"+students.size());
    }
}
