package com.mvc.controller;

import com.mvc.model.Date;

public class DateController {

    public String getRightDate(){
        Date date = new Date();

        return date.getData();
    }
}
