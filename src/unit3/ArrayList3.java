package unit3;
import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of products: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            product.add(sc.next());
        }
        Iterator itr=product.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        product.addLast("Lichi");
        product.addFirst("Gauva");
        //Collections.sort(product);
        System.out.println(product);
        System.out.println(product.getFirst());
    }
}

