/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {

    private static int count = 0;

    private String courseId;
    private String name;
    private String topic;
    private String region;
    private String language;
    private String profname;
    private int price;
    private int credit;//assume each course has 4 credit by defalut
    private String term;

    public Course(String name, String topic, String region, String language, int price, String profN) {
        this.courseId = "Course" + count++;
        this.name = name;
        this.topic = topic;
        this.region = region;
        this.language = language;
        this.price = price;
        this.credit = 4;//assume each course has 4 credit by defalut
        this.profname = profN;
        this.term = " default";

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Course.count = count;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getProfname() {
        return profname;
    }

    public void setProfname(String profname) {
        this.profname = profname;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getCredits() {
        return credit;

    }
    
    @Override
    public String toString() {
        return this.courseId;
    }

}
