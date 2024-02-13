package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}