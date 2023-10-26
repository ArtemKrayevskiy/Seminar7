package com.example.flowerstore.filters;

import com.example.flowerstore.flowers.Item;

public interface SearchFilter {
    boolean match(Item item);
}
