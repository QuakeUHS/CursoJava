package com.roche.vnv.second.srp;

public class Lot implements Printable {

    public Lot(String lotNumber, String controlName, String supplier) {
        this.lotNumber = lotNumber;
        this.controlName = controlName;
        this.supplier = supplier;
    }

    private String lotNumber;
    private String controlName;
    private String supplier;



    public String getLotNumber() {
        return lotNumber;
    }


    public String getControlName() {
        return controlName;
    }


    public String getSupplier() {
        return supplier;
    }


    public String print(){ //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("LOT NUMBER: " + lotNumber);
        return lotNumber;
    }

    public static void main(String[] args) {
        Lot lot = new Lot("test",null,null);
        final ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.output(lot);

    }


}


interface Printable
{
    String print();
}

class ConsolePrinter{
    void output(Printable printable){  //por cada metodo llamara al print de la interficie y asi para esta clase podremos printar el lotnumber, en otra clase si hay un lotId podremos usar para printar LotId
        System.out.println(printable.print());
    }
}
