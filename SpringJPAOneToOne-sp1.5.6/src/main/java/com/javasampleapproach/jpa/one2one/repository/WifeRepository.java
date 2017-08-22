package com.javasampleapproach.jpa.one2one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasampleapproach.jpa.one2one.model.Wife;

public interface WifeRepository extends JpaRepository<Wife, Integer>{
}
