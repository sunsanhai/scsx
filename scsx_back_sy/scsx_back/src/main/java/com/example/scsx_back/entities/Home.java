package com.example.scsx_back.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Home {

    private int id;
    private String realname;
    private String classname;
    private int year;
    private int cfRating;  //cf_account_total_info
    private int cfParticipateTime;
    private int cfSolve;
    private int cfAfter;
    private int acRating;  //ac_account_total_info
    private int acParticipateTime;
    private int acSolve;
    private int acAfter;
}
