class Service{
    Shower shower;
    QRCode qr;

    Service(){
        shower = new Shower();
    }

    public void generate(){
        QRCoce qr = new QRCode();
        int symbol[][] = qr.getQRCode();
        shower.show(symbol);
    }
}