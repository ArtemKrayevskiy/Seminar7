package com.example.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;

public class CreditCardPaymentStrategy implements Payment{
    @GetMapping("/api/payment/creditcard")
    public String pay(double price){
        return "You have chosen to pay via Credit card\nThe sum is " + price;
    }
}
