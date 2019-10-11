import java.util.*;

public class Hashmatique{
    public static void main(String[] args) {
        
        HashMap<String,String> trackList = new HashMap<String, String>();
        trackList.put("Hollywood's Bleeding","Post Malone");
        trackList.put("Saint-Tropez", "Post Malone");
        trackList.put("U Aint Slime Enough", "Young Thug");
        trackList.put("Do You Remember?", "Chance the Rapper");

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }

    }
}