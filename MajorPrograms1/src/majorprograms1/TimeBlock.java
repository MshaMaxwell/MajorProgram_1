/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprograms1;

/**
 *
 * @author andyvo
 */
public class TimeBlock {
    private final DaysOfTheWeek day;
    private int startTime;
    private int endTime;
    private String comments;
    private String location;
    
    
    
    public TimeBlock () {
        day = null;
        startTime = 0;
        endTime = 0;
        comments = "";
        location = "";
        
    }

    /**
     *
     * @return
     */
    @Override
    public String toString () {
        String k = day + "\n" + startTime + "\n" + endTime + "\n" + comments + "\n" + location;
       return k ;
    }
    
    public String getFormTimebBlock () {
        return startTime + "-" + endTime + " " + comments + " " + location;
    }
    
    
    /**
     * @return the day
     */
    public DaysOfTheWeek getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        DaysOfTheWeek dayEnum = DaysOfTheWeek.valueOf(day);
        
    }

    /**
     * @return the startTime
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public int getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
}

