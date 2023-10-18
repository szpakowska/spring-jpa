package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ingredient extends BaseEntity{

    private String description;
    private BigDecimal amount;
    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.LAZY)
    //lazy - odroczenie inicjalizacji obiektów, dopiero jak bedzie potrzebne
    //eager - czy chcesz czy nie, pobieraj juz z góry, zachłanne
    private UnitOfMeasure uom;
}
