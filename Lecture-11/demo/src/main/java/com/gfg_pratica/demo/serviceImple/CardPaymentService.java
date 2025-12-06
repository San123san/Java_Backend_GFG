package com.gfg_pratica.demo.serviceImple;


import com.gfg_pratica.demo.service.PaymentInter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CardPaymentService implements PaymentInter {
}
