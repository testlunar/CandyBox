package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements BoxInterface {
    List<AbstractCandy> box = new ArrayList<>();
    int totalBoxWeight;
    int totalBoxPice;
    String totalBoxInfo;


    public void addItem(AbstractCandy item) {
        box.add(item);
    }


    public void deleteItem(int i) {
        box.remove(i);
    }

    @Override
    public void deleteLastItem() {
        box.remove(box.size()-1);
    }

    public int calculateBoxWeight() {
        for (int i = 0; i < box.size(); i++) {
            totalBoxWeight = totalBoxWeight + box.get(i).weight;

        }
        return totalBoxWeight;

    }

    public int calculateBoxPrice() {
        for (int i = 0; i < box.size(); i++) {
            totalBoxPice = totalBoxPice + box.get(i).price;
        }
        return  totalBoxPice;
    }


    public void getBoxInfo() {
        System.out.println("Состав подарка: ");
        for (int i = 0; i < box.size(); i++) {
            System.out.println(i + ": " + box.get(i).name + ", цена: " + box.get(i).price+ ", вес: "+box.get(i).weight+",описание: "+box.get(i).description);
        }
    }

    public boolean checkIdentity(int i,int j){
        return box.get(i).equals(box.get(j));
    }


    public int removeItemSmallWeightFirst(int newWeight) {
        int minWeight;

        while (totalBoxWeight>newWeight) {
            for (int i = 0; i < box.size()-1; i++) {
                for (int j = box.size()-1; j>=0 ; j--) {
                    if (box.get(i).weight < box.get(j).weight) {
                        minWeight=box.get(i).weight;
                        box.remove(i);
                        totalBoxWeight = totalBoxWeight - minWeight;
                    }
                    }
                }
            }return totalBoxWeight;
    }

    public int removeItemSmallPriceFirst(int newWeight) {
        int minWeight;

        while (totalBoxWeight>newWeight) {
            for (int i = 0; i < box.size()-1; i++) {
                for (int j = box.size()-1; j>=0 ; j--) {
                    if (box.get(i).price < box.get(j).price) {
                        minWeight=box.get(i).weight;
                        box.remove(i);
                        totalBoxWeight = totalBoxWeight - minWeight;
                    }
                }
            }
        }return totalBoxWeight;
    }
}
