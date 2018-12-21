import java.io.PrintStream;

public class Shower{
    private PrintStream out;
    Shower(){
        out = System.out;
    }
    public void show(int symbol[][]){
        for(int i=0; i < symbol.length; i++){
            for(int j=0; j < symbol[0].length; j++){
                if(symbol[i][j] == 0) out.print("□ ");
                if(symbol[i][j] == 2) out.print("□ ");
                if(symbol[i][j] == 1) out.print("■ ");
            }
            out.print("\n");
        }
    }
}