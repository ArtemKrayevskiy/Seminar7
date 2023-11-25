package com.example.flowerstore.users;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    private  int id;
    @Column(name="email", unique = true)
    private String email;
    private int age;
    private LocalDate dob;
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public AppUser(String email, int age){
        this.age = age;
        this.email = email;
    }
}
