package com.yui.course.repositories;

import com.yui.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposotory extends JpaRepository<User, Long> {

}
