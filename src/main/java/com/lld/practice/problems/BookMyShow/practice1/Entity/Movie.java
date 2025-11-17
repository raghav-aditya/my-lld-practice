package com.lld.practice.problems.BookMyShow.practice1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private int movieId = (int)System.currentTimeMillis()% Integer.MAX_VALUE ;
    private String name ;
}
