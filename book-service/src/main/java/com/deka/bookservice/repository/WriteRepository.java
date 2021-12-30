package com.deka.bookservice.repository;

import com.deka.bookservice.model.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteRepository extends JpaRepository<Writer, Long> {



}
