import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(10);
        long start;
        Random r = new Random();

        for (int i = 0; i < arr.length(); i++) {
            arr.add(r.nextInt(11));
        }

        ArrayList firstArray = arr.toArray();
        ArrayList secondArray = arr.toArray();
        ArrayList thirdArray = arr.toArray();

        //System.out.println(firstArray.toString(", "));
        start = System.currentTimeMillis();
        firstArray.sortBubble();
        //System.out.println(firstArray.toString(", "));
        System.out.println("sortBubble: " + (System.currentTimeMillis() - start));

        //System.out.println(secondArray.toString(", "));
        start = System.currentTimeMillis();
        secondArray.sortSelection();
        ///System.out.println(secondArray.toString(", "));
        System.out.println("sortSelection: " + (System.currentTimeMillis() - start));

        //System.out.println(thirdArray.toString(", "));
        start = System.currentTimeMillis();
        thirdArray.sortInsertion();
        //System.out.println(thirdArray.toString(", "));
        System.out.println("sortInsertion: " + (System.currentTimeMillis() - start));

        System.out.println(thirdArray.toString(", "));
        System.out.println(thirdArray.contains(10));
    }
}