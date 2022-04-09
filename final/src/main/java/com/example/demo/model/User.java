package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String pwd;
    private String name;
    private String phone;
    
//    @JsonIgnore
//    @OneToMany(mappedBy = "user")
//    @JoinColumn(name = "USER_ID")
//    List<Post> postList = new ArrayList<>();
}


