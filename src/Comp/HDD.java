package Comp;

public class HDD {
    String name;
    int volume;
    String type;
    public HDD (){
        this.name="iHdd";
        this.volume=1024;
        this.type="Встроенный";
    }
    public HDD (String name,int volume, String type) {
        this.name=name;
        this.volume=volume;
        this.type=type;

    }
    public void infoHDD1 () {
        String infoHdd1="HDD: "+this.name+"\n"+"Объём: "+this.volume+" GB"+"\n"+"Тип: "+this.type+"\n";
        System.out.println(infoHdd1);
    }
    public void infoHDD2() {
        String infoHDD2 = "HDD: "+this.name+"\n"+"Объём: "+this.volume+" GB"+"\n"+"Тип: "+this.type+"\n";
        System.out.println(infoHDD2);
    }


}
