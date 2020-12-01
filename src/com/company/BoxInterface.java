package com.company;

public interface BoxInterface {
    void addItem(AbstractCandy item);
    void deleteItem(int i);
    void deleteLastItem();
    int calculateBoxWeight();
    int calculateBoxPrice();
    void getBoxInfo();
    boolean checkIdentity(int i, int j);
    int removeItemSmallWeightFirst(int i);
    int removeItemSmallPriceFirst(int i);
}
