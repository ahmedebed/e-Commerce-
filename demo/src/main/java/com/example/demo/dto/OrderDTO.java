package com.example.demo.dto;

import com.example.demo.Entity.Order;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    @NotBlank(message = "Address is req")
    private String address;
    @NotBlank(message = "Phone is req")
    private String phoneNumber;
    private Order.OrderStatus status;
    private LocalDateTime createAt;
    private List<OrderItemDTO> orderItems;

}
