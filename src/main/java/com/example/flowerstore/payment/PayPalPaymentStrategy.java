package com.example.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;

public class PayPalPaymentStrategy implements Payment{
    @GetMapping("/api/payment/paypal")
    public String pay(double price){
        return "You have chosen to pay via PayPal\nThe sum is " + price;
    }
}
