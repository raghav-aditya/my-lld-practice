package com.lld.practice.problems.BookMyShow.practice1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theatre {

    private int theatreId = (int)System.currentTimeMillis()% Integer.MAX_VALUE ;
    private List< Show > show ;
}
