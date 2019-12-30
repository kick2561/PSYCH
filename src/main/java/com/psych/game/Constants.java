package com.psych.game;

import com.psych.game.model.Gamemode;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final int MAX_ROUNDS = 100;
    public static final int MAX_QUESTION_LENGTH = 1000;
    public static final int MAX_ANSWER_LENGTH = 1000;
    public static final int MAX_QUESTIONS_TO_READ = 100;
    public static final Map<String, Gamemode> QA_FILES = new HashMap<>();

    static {
        QA_FILES.put("qa_facts.txt", Gamemode.IS_THIS_A_FACT);
        QA_FILES.put("qa_unscramble.txt", Gamemode.UNSCRAMBLE);
        QA_FILES.put("qa_words.txt", Gamemode.WORD_UP);
    }
}
