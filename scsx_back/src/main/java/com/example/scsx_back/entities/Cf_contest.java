package com.example.scsx_back.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cf_contest {

    private int id; // ID
    private String name;//name
    private String type;//type
    private int level;
    private Long startTimeStamp;
    private Long endTimeStamp;
    private int duration;
    private int is_normal;
    private int participate;

}
