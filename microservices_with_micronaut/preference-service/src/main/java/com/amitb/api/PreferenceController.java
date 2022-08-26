package com.amitb.api;

import com.amitb.domain.Preference;
import com.amitb.service.PreferenceService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

import javax.validation.Valid;

@Controller("/api/preferences")
public class PreferenceController {

    private final PreferenceService preferenceService;

    public PreferenceController(PreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    @Get("/{userId}")
    public HttpResponse<Preference> getPreferencesByUserId(@PathVariable Integer userId) {
        return HttpResponse.ok(preferenceService.findByUserId(userId));
    }

    @Post
    public HttpResponse<Preference> createPreference(@Valid @Body Preference preference) {
        return HttpResponse.created(preferenceService.createPreference(preference));
    }

}