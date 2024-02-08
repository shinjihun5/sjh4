package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class unifriend extends friend {
    private String major;

    public  unifriend(String name, String major, String phone){

    //    super(name, phone);
        this.major = major;
    }



    }

