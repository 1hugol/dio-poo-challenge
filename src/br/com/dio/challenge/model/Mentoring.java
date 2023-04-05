package br.com.dio.challenge.model;

import java.time.LocalDate;

public class Mentoring {

    private String title;
    private String description;
    private LocalDate dateMentoring;

    public Mentoring() {
    }

    public Mentoring(String title, String description, LocalDate dateMentoring) {
        this.title = title;
        this.description = description;
        this.dateMentoring = dateMentoring;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateMentoring() {
        return dateMentoring;
    }

    public void setDateMentoring(LocalDate dateMentoring) {
        this.dateMentoring = dateMentoring;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateMentoring=" + dateMentoring +
                '}';
    }
}
