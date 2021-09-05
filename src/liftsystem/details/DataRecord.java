package liftsystem.details;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum DataRecord {
    INSTANCE;
    Map<Integer , List<Character>> lifts = new HashMap<>();

    public void addLift(int floor , char lift){
        List <Character> liftList = lifts.get(floor);
        if(liftList == null){
            liftList = new ArrayList<>();
            lifts.put(floor , liftList);
        }
        liftList.add(lift);
    }

    public Character getLift(int floor){
        List <Character> liftList = lifts.get(floor);
        if(liftList == null){
            return null;
        }
        if (liftList.isEmpty()){
            return null;
        }
        return liftList.get(0);
    }
}
