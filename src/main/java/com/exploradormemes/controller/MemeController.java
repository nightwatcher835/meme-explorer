package com.exploradormemes.controller;

import com.exploradormemes.model.Meme;
import com.exploradormemes.repository.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memes")
public class MemeController {

    @Autowired
    private MemeRepository memeRepository;

    @GetMapping
    public List<Meme> getAllMemes(@RequestParam(required = false) String category) {
        if (category != null) {
            return memeRepository.findByCategory(category);
        }
        return memeRepository.findAll();
    }

    @PostMapping
    public Meme createMeme(@RequestBody Meme meme) {
        return memeRepository.save(meme);
    }
}
