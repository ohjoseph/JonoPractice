package com.practice.android.jonopractice;

/**
 * Created by Joseph on 6/1/16.
 */

public class Question {
    private int mQuestion;
    private boolean mAnswer;

    public Question(int questionId, boolean answer){
        mQuestion = questionId;
        mAnswer = answer;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

}
