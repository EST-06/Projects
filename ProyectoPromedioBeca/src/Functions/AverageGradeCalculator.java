package Functions;

import DataBase.UsersData;

/**
 *
 * @author Esteban
 */
public class AverageGradeCalculator {
    private UsersData us = new UsersData();
    private Double averageGrade = 0.0;
    
    public void calculator(int index){
        
        String grade = us.getGrades().get(index);
        String[] grades = grade.split(",");
        for( String element: grades){
            averageGrade +=  Double.parseDouble(element);
        }
        averageGrade /= grades.length;        
    }

    public Double getAverageGrade() {
        return averageGrade;
    }
    
    
    
    
    
}
