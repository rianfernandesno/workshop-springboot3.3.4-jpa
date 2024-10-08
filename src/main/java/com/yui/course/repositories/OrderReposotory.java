package com.yui.course.repositories;

import com.yui.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReposotory extends JpaRepository<Order, Long> {
}
