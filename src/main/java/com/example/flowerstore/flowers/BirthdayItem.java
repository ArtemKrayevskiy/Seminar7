package com.example.flowerstore.flowers;

public class BirthdayItem extends ItemDecorator{

    public BirthdayItem(Item item){
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() - (super.getPrice()/10);
    }

    public String toString(){
        return "Happy birthday, you get 10% off for this item";
    }

}
