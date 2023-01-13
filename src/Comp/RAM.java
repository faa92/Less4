package Comp;

public class RAM {
    String name;
    int volume;

    public RAM (){
        this.volume=32;
        this.name="iRam";
    }
    public RAM (String name,int volume) {
        this.name=name;
        this.volume=volume;
    }
    public void infoRAM1 () {
        String infoRAM1 ="RAM: "+this.name+"\n"+"Объёь: "+this.volume;
        System.out.println(infoRAM1);
    }
    public void infoRAM2 () {
        String infoRAM2 = "RAM: "+this.name+"\n"+"Объёь: "+this.volume;
        System.out.println(infoRAM2);

    }


}
