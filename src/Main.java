import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        String[] fruits = {"banana","apple","pineapple","watermelon"};
        Arrays.sort(fruits);
//        Arrays.fill(fruits,"orange");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

    }
}