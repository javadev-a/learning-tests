package org.learn.axonframework.axonsaga.command;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class FileOrderCommand {

    private String orderId;
    private String productName;
    private String description;

    public String getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }
}