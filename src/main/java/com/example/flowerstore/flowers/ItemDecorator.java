package com.example.flowerstore.flowers;

public  class ItemDecorator extends Item{

    private Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }

    public String getDescription(){
        return item.toString();
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
}
