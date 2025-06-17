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
        Map<String, String> foundMap = new HashMap<>();
        List<String> foundString = new ArrayList<>();
        List<ForbiddenWord> words = wordRepository.findAll();
        for (ForbiddenWord word : words) {
            if (content.contains(word.getWord())) {
                foundString.add(word.getWord()+"("+word.getCategory()+")");
                foundMap.put(word.getWord(), word.getCategory());
            }
        }

        return new CheckResponse(foundMap.isEmpty(), foundString, foundMap);
    }
}

