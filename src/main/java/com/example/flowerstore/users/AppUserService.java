package com.example.flowerstore.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository){
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers(){
        return  appUserRepository.findAll();
    }

    public void addUser( AppUser appUser){
        this.appUserRepository.save(appUser);
    }

}
