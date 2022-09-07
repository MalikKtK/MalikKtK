package com.example.my_first_website_new.service;

import org.springframework.boot.ansi.AnsiColor;

import java.time.LocalDate;

public class CurrentDay {
    LocalDate localDate = LocalDate.now();

    String weekDay = localDate.getDayOfWeek().toString();

    public String isFriday() {

        if ("FRIDAY".equals(weekDay)) {
            return AnsiColor.GREEN + "Ja ";
        } else {
            return AnsiColor.RED + "Nej ";
        }
    }
}

