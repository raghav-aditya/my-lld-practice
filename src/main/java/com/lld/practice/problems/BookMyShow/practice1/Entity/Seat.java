package com.lld.practice.problems.BookMyShow.practice1.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

    private int seatId = (int) (System.currentTimeMillis()% Integer.MAX_VALUE);
    private SeatStatus seatStatus = SeatStatus.AVAILABLE ;

}
