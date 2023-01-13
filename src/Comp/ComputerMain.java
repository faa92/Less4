package Comp;

public class ComputerMain {
    public static void main (String[] args) {

        Computer Comp1 = new Computer();
        Comp1.infoCOMP1();
        HDD hdd1 = new HDD();
        RAM ram1 = new RAM();
        ram1.infoRAM1();
        hdd1.infoHDD1();


        Computer Comp2 = new Computer("LG",1000);
        Comp2.infoComp2();
        HDD hdd2 = new HDD("LG",512,"Встроенный");
        RAM ram2 = new RAM("LG",16);
        ram2.infoRAM2();
        hdd2.infoHDD2();







    }
}
