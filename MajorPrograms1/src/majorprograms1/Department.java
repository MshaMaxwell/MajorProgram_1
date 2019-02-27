/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprograms1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andyvo
 */
public class Department {
    private String departmentName;
    private String unitName;
    private String universityName;
    private ArrayList <Faculty> faculties;
    
    public Department () {
        departmentName = "";
        unitName = "";
        universityName = "";
        faculties = new ArrayList<>(); 
        
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the unitName
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param unitName the unitName to set
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * @return the universityName
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName the universityName to set
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * @return the faculties
     */
    public ArrayList <Faculty> getFaculties() {
        return faculties;
    }

    /**
     * @param faculties the faculties to set
     */
    public void setFaculties(ArrayList <Faculty> faculties) {
        this.faculties = faculties;
    }
    
    @Override
    public String toString () {
        String k = departmentName + "\n" + unitName + "\n" + universityName + "\n";
        
        k = faculties.stream().map((h) -> h.toString() + "\n").reduce(k, String::concat);
        return k;
    }
    
    public void loadData (String fileName) {
        try {
            Scanner scanner = new Scanner (new File(fileName));
              
                departmentName = scanner.nextLine();
                    unitName = scanner.nextLine();
                    universityName = scanner.nextLine();
                    
                while (scanner.hasNext()) {
                    
                    Faculty fac = new Faculty();
                    fac.setFirstName(scanner.nextLine());
                    fac.setLastName(scanner.nextLine());
                    fac.setOfficeLocation(scanner.nextLine());
                            
                      int numClasses = scanner.nextInt();
                      scanner.nextLine();
                      
                      for ( int i=0; i<numClasses; i++) {
                          Course a = new Course();
                          a.setCourseName(scanner.nextLine());
                          a.setLocation(scanner.nextLine());
                          int numTimes = scanner.nextInt();
                          scanner.nextLine();
                          
                          for (int j = 0; j < numTimes; j++) {
                              TimeBlock l = new TimeBlock();
                              String [] array = scanner.nextLine().split(" ,");
                              l.setDay(array[0]);
                              l.setStartTime(Integer.parseInt(array[1]));
                              l.setEndTime(Integer.parseInt(array[2]));
                              a.getTb().add(l);
                            }        
                                fac.getCourse().add(a);
                      }
                    faculties.add(fac);
                }  
        }catch (FileNotFoundException ex) {
            System.err.println("Cannot find file");
            System.exit(-1);
        }
    }
    
        public void saveData ( String fileName) {
            try {
                try (PrintWriter variable = new PrintWriter (new File(fileName))) {
                    String kk = variable + "\n" + departmentName + "\n" + universityName + "\n" + unitName + "\n";
                    
                    for(int i = 0; i<faculties.size(); i++) {
                        variable.println (faculties.get(i).toString());
                    }
                }
            }catch (FileNotFoundException e) {
                System.err.println("Cannot find file");
                System.exit(-1);
            
        }
        }
        
        public String AtaGlance ( int time ) {
            String h = "";
            String cN = "";
            for ( int i = 0; i < faculties.size(); i ++) {
                int z = faculties.get(i).getCourse().size();
                
            for (int o = 0; o < z; o++ ) {
                int dd = faculties.get(i).getCourse().get(o).getTb().size();
            
            for ( int m = 0; m<dd; m++) {
                TimeBlock tb = faculties.get(i).getCourse().get(o).getTb().get(m);      
                
                if ( tb.getStartTime()>=time && tb.getEndTime()<time) {
                    h += cN + "at " + tb.getFormTimebBlock();
                }
                
            }   
            }   
            }
            return h;
        }
        


}
    

