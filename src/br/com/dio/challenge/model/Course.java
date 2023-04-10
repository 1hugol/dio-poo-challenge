package br.com.dio.challenge.model;

public class Course extends Content{

    private int courseLoad;

    public Course() {
        super();
    }

    public Course(String title, String description, int courseLoad) {
        super(title, description);
        this.courseLoad = courseLoad;
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public double calculateXp() {
        return XP_PATTERN * courseLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
