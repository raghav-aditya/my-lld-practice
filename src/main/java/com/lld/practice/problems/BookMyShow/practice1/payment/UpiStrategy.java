package com.lld.practice.problems.BookMyShow.practice1.payment;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpiStrategy implements PaymentStrategy {
    @Override
    public void process(double amout) {
        log.info("Pay of amout {} done using UPI");
    }
}
