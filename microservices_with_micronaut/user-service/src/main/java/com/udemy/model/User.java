package com.udemy.model;

import io.micronaut.core.annotation.Introspected;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Introspected
public class User {

    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String mobileNumber;
    @NotBlank
    private String email;

}
