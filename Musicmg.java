import java.util.LinkedList;
public class Musicmg {
    public static void main(String[] args){
        LinkedList<String> music=new LinkedList<String>();
        music.add("Orum Blood....");
        music.add("Chamaki.....");
        music.add("Namo re.....");
        music.add("Mala tum tum..");
        music.add("Neno butterfly...");
        System.out.println("LinkedList:"+music);
        music.add("Chinni gundelo...");
        music.add("nu Vuntey na jathaga..");
        music.remove("Mala tum tum..");
        System.out.println("First song:"+music.get(0));
        System.out.println("Last  song:"+music.get(4));
        System.out.println("Size:"+music.size());
        System.out.println("LinkedList:"+music);
    }
}
