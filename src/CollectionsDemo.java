import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {

//        setDemo();
        mapDemo();

    }

    /**
     * looping through the set collection
     */

    public static void setDemo(){

        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("mango");
        fruit.add("lemon");
        fruit.add("orange");

        System.out.println(fruit);
        System.out.println(fruit.size());

        //looping through the collection

//        var i = fruit.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }

        //using the enhanced for loop
//        for(String item: fruit){
//            System.out.println(item);
//        }

        //using for each
        fruit.forEach(x -> System.out.println(x));

    }

    public static void listDemo(){

    }

    public static void queueDemo(){

    }

    public static void mapDemo(){
        Map<String, Integer> fruitsCalories = new HashMap();

        fruitsCalories.put("apple", 95);
        fruitsCalories.put("banana", 69);
        fruitsCalories.put("lemon", 48);
        fruitsCalories.put("orange", 34);
        fruitsCalories.put("banana", 86);

//        System.out.println(fruitsCalories.size());
//        System.out.println(fruitsCalories);
//
//        System.out.println(fruitsCalories.get("apple"));
//
//        System.out.println(fruitsCalories.entrySet());
//
//        fruitsCalories.remove("orange");
//        System.out.println(fruitsCalories);

        //looping with enhanced for loop
//        for(var item : fruitsCalories.entrySet()){
//            System.out.println(item.getValue());
//        }

        fruitsCalories.forEach((key, value) -> System.out.println("Fruit: "+key + ", calorie: " + value));


    }
}
