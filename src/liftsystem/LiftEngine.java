package liftsystem;

import liftsystem.details.DataRecord;

public class LiftEngine {

    public void initialize(){
        DataRecord.INSTANCE.addLift(0, 'A');
        DataRecord.INSTANCE.addLift(0, 'B');
        DataRecord.INSTANCE.addLift(0, 'C');
        DataRecord.INSTANCE.addLift(0, 'D');
        DataRecord.INSTANCE.addLift(0, 'E');
    }

    public Character assignLift(int from , int to){
        Character lift = getFreeLift(from);
        return lift;
    }

    private Character getFreeLift(int from) {
        Character free = DataRecord.INSTANCE.getLift(from);
        int i=1;
        while(from-i >=0 || from +i <=10){
            if(free == null && from-i>=0) {
//                System.out.println(from-i);
                free = DataRecord.INSTANCE.getLift(from - i);
            }
            if(free == null && from+i <=10) {
//                System.out.println(from+i);
                free = DataRecord.INSTANCE.getLift(from + i);
            }
            if(free != null){
                break;
            }
            i++;
        }
        return free;
    }
}
