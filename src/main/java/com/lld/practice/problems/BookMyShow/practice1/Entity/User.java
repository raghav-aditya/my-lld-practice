package com.lld.practice.problems.BookMyShow.practice1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int userId = (int) System.currentTimeMillis()% Integer.MAX_VALUE;
    private String firstName ;
    private String lastName ;
    private String phoneNo ;
}
