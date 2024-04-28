package com.dmtrmrzv.ecomerce.service;

import com.dmtrmrzv.ecomerce.dto.PaymentInfo;
import com.dmtrmrzv.ecomerce.dto.PurchaseDto;
import com.dmtrmrzv.ecomerce.dto.PurchaseResponseDto;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponseDto placeOrder(PurchaseDto purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;


}
