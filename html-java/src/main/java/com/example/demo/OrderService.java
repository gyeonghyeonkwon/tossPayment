package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void checkAmount(String orderId, String amount) {

        //브라우저 console 에서 결제금액을 변경하면 예외처리를 한다.

        //해당 주문 번호에 최종 결제 금액이 정말 amount  와 일치하는지 확인하는 로직이 들어간다,
        boolean matched = true;

        // 만약 결제 금액이 일치 하지 않는 다면  , 예외를 발생 시킨다
        if(!matched) throw new RuntimeException("결제 금액이 일치하지 않습니다");
    }

    public void setPaymentComplete(String orderId) {

    }
}
