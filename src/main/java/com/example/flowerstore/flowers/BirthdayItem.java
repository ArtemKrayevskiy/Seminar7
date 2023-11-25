package com.example.flowerstore.flowers;

public class BirthdayItem extends ItemDecorator{
    private Item item;

    public BirthdayItem(Item item){
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() - (item.getPrice()/10);
    }

    public String toString(){
        return "Happy birthday, you get 10% off for this item";
    }

}
