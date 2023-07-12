package com.example.scsx_back.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cf_contest {

    private int cid; // ID
    private String name;//name
    private String type;//type
    private int level;
    @Column(name = "start_time_stamp")
    private long start_time_stamp;
    @Column(name = "end_time_stamp")
    private long end_time_stamp;
    private int duration;
    private int is_normal;
    private int participate;

}
