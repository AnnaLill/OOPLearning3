package ru.synergy;

public class Rect {
    public double height;
    public double wight;
    public String nameOfRect;
    public double getArea;


    public double getArea(){
        return wight*height;
    }

    public void maignyfy (double koeff){
        wight *= koeff;
        height *= koeff;
    }


    @Override
    public String toString() {
        return "Rect{" +
                "height=" + height +
                ", wight=" + wight +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }
}

