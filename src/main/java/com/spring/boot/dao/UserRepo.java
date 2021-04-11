package com.spring.boot.dao;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.boot.entity.Users;

import net.bytebuddy.implementation.bind.annotation.Super;

public interface UserRepo extends JpaRepository<Users, Integer> {

	public List<Users> findByNameAndCity(String name, String city);

	@Query("SELECT u FROM Users u")
	public List<Users> getAllUser();

	@Query("SELECT u FROM Users u WHERE u.name=:n")
	public List<Users> getAllUserByName(@Param("n") String name);

	@Query(value = "select * from Users", nativeQuery = true)
	public List<Users> getAllUserNative();
}
