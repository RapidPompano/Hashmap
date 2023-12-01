import java.util.HashMap;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       HashMap<Integer, String> map = new HashMap<Integer, String>();
       map.put(1,"val-1");
       map.put(2,"val-2");
       map.put(3,"val-3");
       
       System.out.println(map.get(1));
        System.out.println(map.get(2));


    }
}
