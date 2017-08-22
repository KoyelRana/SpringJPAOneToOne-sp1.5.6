package com.javasampleapproach.jpa.one2one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasampleapproach.jpa.one2one.model.Husband;

public interface HusbandRepository extends JpaRepository<Husband, Integer>{
}