package Comp;

public class Computer {
    int price;
    String model;

    RAM ram ;
    HDD hdd;


    public Computer () {
        this.price=1200;
        this.model="Apple";
        this.ram=new RAM();
        this.hdd=new HDD();
    }
    public Computer(String model,int price) {
        this.model=model;
        this.price=price;
        this.ram=new RAM("LG",16);
        this.hdd=new HDD("Seagate",500,"internal");

    }
    public void infoCOMP1 () {
        String infoComp1="Модель: "+this.model+"\n"+"Цена: "+this.price;
        System.out.println(infoComp1);
    }
    public void infoComp2 () {
        String infoComp2="Модель: "+this.model+"\n"+"Цена: "+this.price;
        System.out.println(infoComp2);
    }






}
