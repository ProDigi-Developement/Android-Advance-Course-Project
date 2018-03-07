package prodigi_development.advancedcourseproject.Model;

/**
 * Created by antho on 3/6/2018.
 */

public class Job {
    private String title, salary, benefits, startDate, postingDate, description;

    public Job() {
    }

    public Job(String title, String salary, String benefits, String startDate, String postingDate, String description) {
        this.title = title;
        this.salary = salary;
        this.benefits = benefits;
        this.startDate = startDate;
        this.postingDate = postingDate;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getSalary() {
        return salary;
    }

    public String getBenefits() {
        return benefits;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public String getDescription() {
        return description;
    }
}
