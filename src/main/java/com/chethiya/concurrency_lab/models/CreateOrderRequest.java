package com.chethiya.concurrency_lab.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.util.UUID;

@Data
public class CreateOrderRequest {

    @NotNull(message = "Product ID is required")
    private UUID productId;

    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    public CreateOrderRequest() {
    }

    public CreateOrderRequest(UUID productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

}
