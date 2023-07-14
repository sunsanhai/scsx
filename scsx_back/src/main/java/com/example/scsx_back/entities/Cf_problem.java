package com.example.scsx_back.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cf_problem {

        private int cid;
        private String name;
        private String type;
        private int level;
        private Long startTimeStamp;

        private Long endTimeStamp;
        private int duration;

        private int is_normal;
        private int id;
        private String problemName;
        private String qindex;
        private int difficulty;
        private String tags;
}
