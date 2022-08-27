package com.udemy.controller;

import com.udemy.model.User;
import com.udemy.model.UserResponse;
import com.udemy.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

import javax.validation.Valid;
import java.util.List;

@Controller("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Post
    public HttpResponse<User> createUser(@Body @Valid User user) {
        return HttpResponse.created(userService.createUser(user));
    }

    @Get
    public HttpResponse<List<User>> getAllUsers() {
        return HttpResponse.ok(userService.getAllUsers());
    }

    @Get("/{id}")
    public HttpResponse<UserResponse> getUser(@PathVariable int id) {
        return HttpResponse.ok(userService.getUserDetails(id));
    }

    @Put("/{id}")
    public HttpResponse<User> updateUser(@PathVariable int id, @Body User user) {
        return HttpResponse.ok(userService.updateUser(id, user));
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return HttpResponse.ok();
    }

}
