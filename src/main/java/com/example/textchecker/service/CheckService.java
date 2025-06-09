package com.example.textchecker.service;

import com.example.textchecker.dto.CheckResponse;
import com.example.textchecker.entity.ForbiddenWord;
import com.example.textchecker.repository.ForbiddenWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CheckService {

    @Autowired
    private ForbiddenWordRepository wordRepository;

    public CheckResponse check(String content) {
        List<String> found = new ArrayList<>();

        List<ForbiddenWord> words = wordRepository.findAll();
        for (ForbiddenWord word : words) {
            if (content.contains(word.getWord())) {
                found.add(word.getWord());
            }
        }

        return new CheckResponse(found.isEmpty(), found);
    }
}

