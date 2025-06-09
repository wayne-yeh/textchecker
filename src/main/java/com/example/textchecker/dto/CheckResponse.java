package com.example.textchecker.dto;

import java.util.List;

public class CheckResponse {
    private boolean isPass;
    private List<String> ileagalWords;
    private int illegalWordCount;

    public CheckResponse(boolean isPass, List<String> ileagalWords) {
        this.isPass = isPass;
        this.ileagalWords = ileagalWords;
        this.illegalWordCount = ileagalWords != null ? ileagalWords.size() : 0;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public List<String> getIleagalWords() {
        return ileagalWords;
    }

    public void setIleagalWords(List<String> ileagalWords) {
        this.ileagalWords = ileagalWords;
    }

    public int getIllegalWordCount() {
        return illegalWordCount;
    }

    public void setIllegalWordCount(int illegalWordCount) {
        this.illegalWordCount = illegalWordCount;
    }
}

