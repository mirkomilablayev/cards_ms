package com.example.cardsservice.controller;


import com.example.cardsservice.entity.Card;
import com.example.cardsservice.entity.Customer;
import com.example.cardsservice.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardController {


    private final CardRepository cardRepository;

    @PostMapping("/myCards")
    public List<Card> getMyCards(@RequestBody Customer customer) {
        return cardRepository.findAllByCustomerId(customer.getCustomerId());
    }
}
