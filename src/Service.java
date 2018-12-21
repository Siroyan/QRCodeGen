class Service{
    Shower shower;
    QRCode qr;

    Service(){
        shower = new Shower();
    }

    public void generate(){
        QRCode qr = new QRCode();
        qr.makeSymbol();
        //int symbol[][] = qr.getSymbol();
        //shower.show(symbol);
    }
}