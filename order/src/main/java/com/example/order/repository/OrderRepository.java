package com.example.order.repository;

import com.example.order.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {}
