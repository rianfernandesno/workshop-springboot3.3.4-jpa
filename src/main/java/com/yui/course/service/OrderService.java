package com.yui.course.service;

import com.yui.course.entities.Order;
import com.yui.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository reposotory;

    public List<Order> findAll(){
        return reposotory.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj= reposotory.findById(id);
        return obj.get();
    }
}
