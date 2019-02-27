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
public class Appointment {
    private String description;
    private TimeBlock tb; 
    
    public Appointment() {
        description = " ";
        tb = new TimeBlock();
        
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the tb
     */
    public TimeBlock getTb() {
        return tb;
    }

    /**
     * @param tb the tb to set
     */
    public void setTb(TimeBlock tb) {
        this.tb = tb;
    }
    
    @Override
    public String toString() {
        return description + "\n" + tb.toString();
    }
    
    
}
