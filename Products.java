
import java.util.LinkedHashSet;
public class  Products {
    public static void main(String[] args){
        LinkedHashSet<String> product=new LinkedHashSet<String>();
        product.add("Laptop");
        product.add("Mobile");
        product.add("Headphones");
        product.add("Smart Watch");
        product.add("Laptop");
        System.out.println("LinkedHashSet:"+product);
        product.remove("Headphones");
        product.add("Tablet");
        System.out.println("Contains Mobile:"+product.contains("Mobile"));
        System.out.println("LinkedHashSet:"+product);
     }
}
