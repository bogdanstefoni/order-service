package com.polarbookshop.orderservice.order.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Table("orders")
public record Order(

        Long id,

        String bookIsbn,
        String bookName,
        Double bookPrice,
        Integer quantity,
        OrderStatus status,

        @CreatedDate
        Instant createdDate,

        @LastModifiedDate
        Instant lastModifiedDate,

        @Version
        int version
) {
    public static Order of(
            String bookIsbn, String bookName, Double bookPrice,
            Integer quantity, OrderStatus orderStatus
    ) {
        return new Order(
                null, bookIsbn, bookName, bookPrice, quantity , orderStatus, null, null,
                0
        );
    }
}
