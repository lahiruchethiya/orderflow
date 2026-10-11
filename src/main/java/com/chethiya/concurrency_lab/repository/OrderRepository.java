package com.chethiya.concurrency_lab.repository;

import com.chethiya.concurrency_lab.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
