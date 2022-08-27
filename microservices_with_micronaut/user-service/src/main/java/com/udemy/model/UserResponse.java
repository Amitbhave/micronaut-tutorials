package com.udemy.model;

import com.udemy.client.Preference;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponse {

    private User user;
    private Preference preference;

}
