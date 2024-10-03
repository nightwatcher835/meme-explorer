package com.exploradormemes.repository;

import com.exploradormemes.model.Meme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemeRepository extends JpaRepository<Meme, Long> {
    // Encontrar memes por categoria
    List<Meme> findByCategory(String category);
}
