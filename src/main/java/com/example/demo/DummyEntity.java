package com.example.demo;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class DummyEntity {
    private Long id;

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @Column
    public String getName() {
        return name;
    }

    @Transient
    public String getFullName(){
        return "Hans %s".formatted(name);
    }
}