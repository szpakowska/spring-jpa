package com.example.jpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notes extends BaseEntity{

    private String description;
    @OneToOne
    private Recipe recipe;

}
