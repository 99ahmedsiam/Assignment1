/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Ahmed
 */
public class ArtStudent  extends Student
{

    public ArtStudent(double mid, double final_, double report, int id, String name, String major) {
        super(id, name, major);
        this.mid = mid;
        this.final_ = final_;
        this.report = report;
    }
    
    double mid;
    double final_;
    double report;

    @Override
    public double grade()
    {
        
     double grade=(this.mid*.40)+(this.final_*50) + (this.report*.10);
     
     return grade;
        
        
        
    }
    
}
