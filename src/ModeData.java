import java.util.*;

class ModeData{
    List<Integer> indicatorList;
    ModeData(){
        indicatorList = new ArrayList<Integer>(Arrays.asList(0,0,1,0));
    }
    public List<Integer> getModeList(){
        return indicatorList;
    }
}