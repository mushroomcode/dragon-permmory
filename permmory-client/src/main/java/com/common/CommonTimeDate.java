package com.common;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class CommonTimeDate {

//    private
    public String getCurrentTime(String pattern) {
        LocalDate currentTime = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return currentTime.toString();
//        return LocalDate.parse(dateStr, formatter);;
    }

}
