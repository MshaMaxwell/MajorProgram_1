/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprograms1;

import java.util.ArrayList;

/**
 *
 * @author andyvo
 */
public class Course {
    private String courseName;
    private String location;
    private ArrayList <TimeBlock> tb;
    
    public Course () {
        courseName = "";
        location = "";
        tb = new ArrayList<>();
        
    
}



    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    /**
     * @return the tb
     */
    public ArrayList <TimeBlock> getTb() {
        return tb;
    }

    /**
     * @param tb the tb to set
     */
    public void setTb(ArrayList <TimeBlock> tb) {
        this.tb = tb;
    }
    
    @Override
        public String toString () {
           
            String k = courseName + "\n" + location + "\n";

                for ( TimeBlock e: tb) {
                    k += e.toString() + "\n";
                }
                return k;
                
                    


}
    
    
}






