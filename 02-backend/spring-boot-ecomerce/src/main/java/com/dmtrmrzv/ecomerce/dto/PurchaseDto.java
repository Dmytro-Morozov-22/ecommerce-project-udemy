package com.dmtrmrzv.ecomerce.dto;

import com.dmtrmrzv.ecomerce.entity.Address;
import com.dmtrmrzv.ecomerce.entity.Customer;
import com.dmtrmrzv.ecomerce.entity.Order;
import com.dmtrmrzv.ecomerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class PurchaseDto {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
