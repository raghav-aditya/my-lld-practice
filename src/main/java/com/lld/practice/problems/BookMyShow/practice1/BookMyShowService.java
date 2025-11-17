package com.lld.practice.problems.BookMyShow.practice1;


import com.lld.practice.problems.BookMyShow.practice1.Entity.Theatre;
import com.lld.practice.problems.BookMyShow.practice1.Entity.User;
import com.lld.practice.problems.BookMyShow.practice1.payment.PaymentStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
public class BookMyShowService {

        private BookMyShowService instance ;
        private BookMyShowService(){}

        private PaymentStrategy paymentStrategy ;
        private Map< Integer , User> user ;
        private List<Theatre > theatreList ;


        public synchronized BookMyShowService getInstance(){
            if( instance == null )
                instance = new BookMyShowService();
            return instance ;
        }

}
