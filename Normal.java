public class Normal {
    public static void main(String[] args){

        int symbol[][] = new int[21][21];
        QRCode qr = new QRCode();
        symbol = qr.getSymbol();

        for(int i=0; i < symbol.length; i++){
            for(int j=0; j < symbol[0].length; j++){
                if(symbol[i][j] == 0) System.out.print("□ ");
                if(symbol[i][j] == 1) System.out.print("■ ");
            }
            System.out.print("\n");
        }

    }
}
