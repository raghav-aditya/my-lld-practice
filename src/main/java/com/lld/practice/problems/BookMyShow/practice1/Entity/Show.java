package com.lld.practice.problems.BookMyShow.practice1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {

        private Integer showId = (int)System.currentTimeMillis()% Integer.MAX_VALUE ;
        private Screen scrren ;
        private Movie movie ;
        private DateTimeFormat starTime ;
}
