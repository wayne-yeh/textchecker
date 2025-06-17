package com.example.textchecker.dto;

import java.util.List;
import java.util.Map;

public class CheckResponse {
    private boolean isPass;
    private Map<String, String> ileagalWordsAndType;
    private int illegalWordCount;
    private List<String> ileagalWords;

    public CheckResponse(boolean isPass, List<String> ileagalWords, Map<String, String> ileagalWordsAndType) {
        this.isPass = isPass;
        this.ileagalWords = ileagalWords;
        this.ileagalWordsAndType = ileagalWordsAndType;
        this.illegalWordCount = ileagalWordsAndType != null ? ileagalWordsAndType.size() : 0;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public Map<String, String> getIleagalWordsAndType() {
        return ileagalWordsAndType;
    }

    public void setIleagalWordsAndType(Map<String, String> ileagalWordsAndType) {
        this.ileagalWordsAndType = ileagalWordsAndType;
    }

    public int getIllegalWordCount() {
        return illegalWordCount;
    }

    public void setIllegalWordCount(int illegalWordCount) {
        this.illegalWordCount = illegalWordCount;
    }

    public List<String> getIleagalWords() {
        return ileagalWords;
    }

    public void setIleagalWords(List<String> ileagalWords) {
        this.ileagalWords = ileagalWords;
    }
}

