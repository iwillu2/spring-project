package com.tsuyano.springboot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsuyano.springboot.MyData;

@Repository
public interface MyDataRepository extends JpaRepository<MyData, Long>{

	public Optional<MyData> findById(Long name);
	
}
