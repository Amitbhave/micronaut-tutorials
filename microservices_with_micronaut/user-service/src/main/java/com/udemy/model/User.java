package com.udemy.model;

import io.micronaut.core.annotation.Introspected;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Introspected
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @NotBlank
    @Column
    private String name;
    @NotBlank
    @Column
    private String mobileNumber;
    @NotBlank
    @Column
    private String email;

}
