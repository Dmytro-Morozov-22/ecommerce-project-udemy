package com.dmtrmrzv.ecomerce.controller;

import com.dmtrmrzv.ecomerce.dto.PaymentInfo;
import com.dmtrmrzv.ecomerce.dto.PurchaseDto;
import com.dmtrmrzv.ecomerce.dto.PurchaseResponseDto;
import com.dmtrmrzv.ecomerce.service.CheckoutService;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;
    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponseDto placeOrder(@RequestBody PurchaseDto purchase) {

        PurchaseResponseDto purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

    public ResponseEntity<String> createPaymentIntent(@RequestBody PaymentInfo paymentInfo) throws StripeException {

        PaymentIntent paymentIntent = checkoutService.createPaymentIntent(paymentInfo);

        String paymentStr = paymentIntent.toJson();

        return new ResponseEntity<>(paymentStr, HttpStatus.OK);
    }

}
