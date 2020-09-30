package com.revature.quizzard.flashcard.repos;

import com.revature.quizzard.flashcard.entities.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Integer> {
}
