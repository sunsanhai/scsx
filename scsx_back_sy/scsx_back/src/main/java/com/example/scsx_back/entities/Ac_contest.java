package com.example.scsx_back.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ac_contest {

        private int id; // ID
        private String name;//name
        private String type;//type
        private int level;
        private Long start_time_stamp;
        private Long end_time_stamp;
        private int duration;
        private int is_normal;
        private int participate;

}
