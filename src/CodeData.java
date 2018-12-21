import java.util.*;

class CodeData{
    private List<Integer> codeData;
    CodeData(List<Character> rawData){
        codeData = new ArrayList<Integer>();
        //setData
        ModeData mode = new ModeData();
        ErrorLevelData errLv = new ErrorLevelData();
        BinData bin = new BinData(rawData);
        
        for(int n : mode.getModeList()){
            codeData.add(n);
        }
        for(int n : errLv.getErrorLevelList()){
            codeData.add(n);
        }
        for(int n : bin.getBinDataList()){
            codeData.add(n);
        }
        
        //formatBinary(){
        if(codeData.size() < 72){
            for(int i = 0; i < 4; i++){
                 codeData.add(0);
            }
        }
        if(codeData.size() < 72){
            for(int i = 0; i < codeData.size() % 8; i++){
                codeData.add(0);
            }
        }
        int times = 0;
        while(codeData.size() < 72){
            List<Integer> fillData1 = new ArrayList<Integer>(Arrays.asList(1,1,1,0,1,1,0,0));
            List<Integer> fillData2 = new ArrayList<Integer>(Arrays.asList(0,0,0,1,0,0,0,1));
            for(int n : times % 2 == 0 ? fillData1 : fillData2){
                codeData.add(n);
            }
            times++;
        }
    }
    public List<Integer> getCodeData(){
        return codeData;
    }    
}