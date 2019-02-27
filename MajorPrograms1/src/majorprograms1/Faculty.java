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
public class Faculty {
    private String firstName;
    private String lastName;
    private String officeLocation;
    private ArrayList<Course> course;
    private ArrayList<TimeBlock> officeHours;
    private ArrayList<Appointment> appointments;
    
    public Faculty () {
        firstName = "";
        lastName = "";
        officeLocation = "";
        course = new ArrayList<>();
        officeHours = new ArrayList<>();
        appointments = new ArrayList<>();
        
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the officeLocation
     */
    public String getOfficeLocation() {
        return officeLocation;
    }

    /**
     * @param officeLocation the officeLocation to set
     */
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    /**
     * @return the course
     */
    public ArrayList<Course> getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    /**
     * @return the officeHours
     */
    public ArrayList<TimeBlock> getOfficeHours() {
        return officeHours;
    }

    /**
     * @param officeHours the officeHours to set
     */
    public void setOfficeHours(ArrayList<TimeBlock> officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * @return the appointments
     */
    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    /**
     * @param appointments the appointments to set
     */
    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        
        String x = firstName + "\n" + lastName + "\n" + officeLocation + "\n"; 
   
       for ( Course e: course) {
           x += e.toString() + "\n";
       }
       
       for (TimeBlock m: officeHours ) {
           x += m.toString() + "\n";
       }
           
       for (Appointment h: appointments) {
           x+= h.toString() + "\n";
       }
       
       return x;
    }
    //level 2
    
    
    
    public String getCalendar() {
 
    
        String r;
        r = "";
        r = "courses \n ";

        
        for ( int i = 0; i < course.size(); i++){
            r += course.get(i).getCourseName()+ "\n";
          }
       
        r = "officeHours \n ";
        for ( int i = 0; i < officeHours.size(); i++){
            r += officeHours.get(i).getFormTimebBlock() + "\n";
        }
        
        r = "appointments \n";
        for ( int i = 0; i < appointments.size(); i++){
            r += appointments.get(i).toString();
        }
        
        return r;
    }
        
                          

        
       
        
        

}
