package com.example.textchecker.service;

import com.example.textchecker.dto.CheckResponse;
import com.example.textchecker.entity.ForbiddenWord;
import com.example.textchecker.repository.ForbiddenWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CheckService {

    @Autowired
    private ForbiddenWordRepository wordRepository;

    public CheckResponse check(String content) {
        Map<String, String> found = new HashMap<>();

        List<ForbiddenWord> words = wordRepository.findAll();
        for (ForbiddenWord word : words) {
            if (content.contains(word.getWord())) {
                found.put(word.getWord(), word.getCategory());
            }
        }

        return new CheckResponse(found.isEmpty(), found);
    }
}

