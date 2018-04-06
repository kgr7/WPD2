package app.model;

public class Milestone {
    private String title;
    private String description;


    public Milestone(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Milestone(){

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


    public String toString() {
        return "\nMilestone: " + title +
                "\nMilestone Description: " + description;
    }

}