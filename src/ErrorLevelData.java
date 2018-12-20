import java.util.*;

class ErrorLevelData{
    List<Integer> indicatorList;
    ErrorLevelData(){
        indicatorList = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,1,0,0,0));
    }
    public List<Integer> getErrorLevelList(){
        return indicatorList;
    }
}