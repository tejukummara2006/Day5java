import java.util.LinkedList;
public class LinkedlistEx{
    public static void main(String[] args){
        LinkedList<String> names=new LinkedList<String>();
        names.add("Teju");
        names.add("Priya");
        names.add("Mouni");
        names.add("Ruchi");
        System.out.println("Linkedlist:"+names);
        System.out.println("First element:"+names.get(1));
        names.set(0,"Teja");
        names.remove("Ruchi");
        names.addFirst("Sam");
        names.addLast("Anu");
        System.out.println("Size:"+names.size());
    }

}