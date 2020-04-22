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
public class ItStudent extends Student
{
    double mid;
    double final_;

    public ItStudent( double mid, double final_, double project, int id, String name, String major) {
        super(id, name, major);
        this.mid = mid;
        this.final_ = final_;
        this.project = project;
    }
    double project;

    @Override
    public double grade()
    {
        
     double grade=(this.mid*.30)+(this.final_*40) + (this.project*.30);
     
     return grade;
        
        
        
    }
    
}
