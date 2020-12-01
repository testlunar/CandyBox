package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        Chocolate chocolate = new Chocolate();
        AbstractCandy jelly = new Jelly();
        AbstractCandy waffles = new Waffles();

        box.addItem(chocolate);
        box.addItem(jelly);
        box.addItem(waffles);
        box.addItem(chocolate);


        System.out.println("Общий вес: " + box.calculateBoxWeight());
        System.out.println("Общая цена: " + box.calculateBoxPrice());

        box.getBoxInfo();
        //System.out.println("Новый вес коробки: "+ box.removeItemSmallWeightFirst(25));
        //box.getBoxInfo();
        //box.addItem(jelly);
       // box.addItem(waffles);
        System.out.println("Новый вес коробки: "+ box.removeItemSmallPriceFirst(25));
        box.getBoxInfo();

    }
}
