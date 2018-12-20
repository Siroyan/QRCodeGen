import java.util.*;

class SymbolData{
    List<Integer> symbolData;
    public SymbolData(){
        symbolData = new ArrayList<Integer>();
    }
    public void setData(){
        ModeData mode = new ModeData();
        ErrorLevelData errLv = new ErrorLevelData();
        BinData bin = new BinData();
        for(int n : mode.getModeList()){
            symbolData.add(n);
        }
        for(int n : errLv.getErrorLevelList()){
            symbolData.add(n);
        }
        for(int n : bin.getBinDataList()){
            symbolData.add(n);
        }
    }
    public List<Integer> getSymbol(){
        return symbolData;
    }
}