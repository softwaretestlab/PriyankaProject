package BasicsOfJava;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class AT12_HashMap {
    @Test
    public void test16(){
        // at here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map = new HashMap<>();
        //lets add few values into map
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Jasper",1);
        System.out.println(" print map on console : "+ map);
        // size of map
        int mapSize= map.size();
        System.out.println("HashMap SIze is : "+mapSize );
        // if condition -- true will go into loop -- false --will not go into loop
        if(map.containsKey("Bianca")){
            int KeyVal = map.get("Bianca");
            System.out.println("key value is : "+ KeyVal );
        }
    }
}
