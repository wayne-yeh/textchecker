package com.example.textchecker.controller;

import com.example.textchecker.entity.ForbiddenWord;
import com.example.textchecker.repository.ForbiddenWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/forbidden-words")
@CrossOrigin(origins = "*")
public class ForbiddenWordController {

    @Autowired
    private ForbiddenWordRepository repository;

    // 🔍 查詢全部
    @GetMapping
    public List<ForbiddenWord> getAll() {
        return repository.findAll();
    }

    // 🔍 查詢單筆 by ID
    @GetMapping("/{id}")
    public ForbiddenWord getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // ➕ 新增
    @PostMapping
    public ForbiddenWord create(@RequestBody ForbiddenWord word) {
        return repository.save(word);
    }

    // ✏️ 更新
    @PutMapping("/{id}")
    public ForbiddenWord update(@PathVariable Long id, @RequestBody ForbiddenWord updated) {
        return repository.findById(id).map(existing -> {
            existing.setCategory(updated.getCategory());
            existing.setWord(updated.getWord());
            return repository.save(existing);
        }).orElse(null);
    }

    // ❌ 刪除
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
