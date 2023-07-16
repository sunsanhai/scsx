package com.example.scsx_back.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

        private int id;
        private String username;
        private String password;
        private String classname;
        private String stuno;
        private int year;
        private int status;
        private String name;
        private String atcoderId;
        private String codeforcesId;



}
