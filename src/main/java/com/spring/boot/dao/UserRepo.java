package com.spring.boot.dao;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.boot.entity.User;

import net.bytebuddy.implementation.bind.annotation.Super;

public interface UserRepo extends JpaRepository<User, Integer> {

	public List<User> findByNameAndCity(String name, String city);

	@Query("SELECT u FROM User u")
	public List<User> getAllUser();

	@Query("SELECT u FROM User u WHERE u.name=:n")
	public List<User> getAllUserByName(@Param("n") String name);

	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUserNative();
}
