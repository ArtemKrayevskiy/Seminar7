package com.example.flowerstore.users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/flower/users")
public class AppUserController {
    private  final AppUserService appUserService;
    public AppUserController(AppUserService appUserService){
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAppUser(){
        return appUserService.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody AppUser appUser){
        this.appUserService.addUser(appUser);
    }
}
