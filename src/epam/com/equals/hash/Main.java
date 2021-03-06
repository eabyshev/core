package epam.com.equals.hash;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Main {

    public static void main(String[] args) {
        HashSet<Box> hashSet = new HashSet<Box>();

        // методы equals hashcode непереопределены
        Box box1 = new Box("black", 5, 5);
        Box box2 = new Box("black", 6, 5);
        Box box3 = new Box("black", 7, 5);

//        System.out.println( "Not Override objects:" );
//        print( box1, box2 );

//        System.out.println( "Contains of HashSet:" );
        hashSet.add(box1);
        hashSet.add(box2);
        hashSet.add(box3);
        hashSet.add(box2);

        for (final Box box : hashSet) {
//            System.out.println( box.toString() );
        }

        // методы equals hashcode переопределены
//        box1 = new BoxOverride( "white", 5, 5 );
//        box2 = new BoxOverride( "white", 5, 5 );
//        Box box3 = new BoxOverride( "white", 5, 5 );

        HashMap<Box, String> map = new HashMap<Box, String>();
        map.put(box1, "test1");
        map.put(box2, "test2");
        map.put(box3, null);
        map.put(null, "test3");
        map.put(null, null);

//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println("finish");

        for (String s : map.values()) {
            System.out.println(s);
        }

        System.out.println();

        for (Box box : map.keySet()) {
            System.out.println(box);
        }

        System.out.println();
        for (Map.Entry<Box, String> boxStringEntry : map.entrySet()) {
            System.out.println(boxStringEntry);
        }
//        System.out.println();
//        System.out.println( "Override objects:" );
//        print( box1, box2 );

//        System.out.println( "Contains of HashSet:" );
        hashSet.clear();
        hashSet.add(box1);
        hashSet.add(box2);

//        for ( final Box box : hashSet )
//        {
//            System.out.println( box.toString() );
//        }
    }


    private static void print(final Box box1, final Box box2) {
        System.out.println(box1.toString());
        System.out.println(box2.toString());
        System.out.println("hashcode notOverrideBox: " + box1.hashCode());
        System.out.println("hashcode notOverrideBox2: " + box2.hashCode());
        System.out.println("equals: " + box1.equals(box2));
    }
}
