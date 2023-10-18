package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@Entity
public class Category extends BaseEntity{


    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}

