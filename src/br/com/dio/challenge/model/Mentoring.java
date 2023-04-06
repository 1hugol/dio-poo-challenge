package br.com.dio.challenge.model;

import java.time.LocalDate;

public class Mentoring extends Content{

    private LocalDate dateMentoring;

    public Mentoring() {
        super();
    }

    public Mentoring(String title, String description, LocalDate dateMentoring) {
        super(title, description);
        this.dateMentoring = dateMentoring;
    }

    public LocalDate getDateMentoring() {
        return dateMentoring;
    }

    public void setDateMentoring(LocalDate dateMentoring) {
        this.dateMentoring = dateMentoring;
    }

    @Override
    public double calculateXp() {
        return XP_PATTERN + 20d;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", dateMentoring=" + dateMentoring +
                '}';
    }
}
