package com.example.cardsservice.repository;

import com.example.cardsservice.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findAllByCustomerId(Long customerId);
}
