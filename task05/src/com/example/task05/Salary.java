package com.example.task05;

public class Salary implements Sendable<Integer> {
    private final String from;
    private final String to;
    private final Integer content;

    public Salary(String from, String to, Integer content) {
        if (from == null || to == null || content == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}