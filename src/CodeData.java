import java.util.*;

class CodeData{
    List<Integer> codeData;
    CodeData(){
        codeData = new ArrayList<Integer>();
    }
    public void setData(){
        ModeData mode = new ModeData();
        ErrorLevelData errLv = new ErrorLevelData();
        BinData bin = new BinData();
        for(int n : mode.getModeList()){
            codeData.add(n);
        }
        for(int n : errLv.getErrorLevelList()){
            codeData.add(n);
        }
        for(int n : bin.getBinDataList()){
            codeData.add(n);
        }
    }
    public List<Integer> getCodeData(){
        return codeData;
    }
}