package com.lld.practice.problems.BookMyShow.practice1.Entity;

import lombok.Data;

import java.util.List;

@Data
public class Screen {

    private int screenId = (int) System.currentTimeMillis()% Integer.MAX_VALUE ;
    private List<Seat> seats ;
}
