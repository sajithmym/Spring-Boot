package com.sajithmym.mysqlcrud.repository;

import com.sajithmym.mysqlcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
