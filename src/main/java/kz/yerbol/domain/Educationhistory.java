package kz.yerbol.domain;
// Generated 28.10.2016 18:30:19 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




/**
 * Educationhistory generated by hbm2java
 */

 @Entity
 @Table(name = "Educationhistory")
public class Educationhistory  implements java.io.Serializable {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ideducationHistory")
    private Integer ideducationHistory;

		@ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @Column(name = "educatedPlaceName")
    private String educatedPlaceName;

    @Column(name = "duringTime")
    private String duringTime;

    @Column(name = "anddress")
    private String anddress;

    public Educationhistory() {
    }

	
    public Educationhistory(Student student) {
        this.student = student;
    }
    public Educationhistory(Student student, String educatedPlaceName, String duringTime, String anddress) {
       this.student = student;
       this.educatedPlaceName = educatedPlaceName;
       this.duringTime = duringTime;
       this.anddress = anddress;
    }
   
    public Integer getIdeducationHistory() {
        return this.ideducationHistory;
    }
    
    public void setIdeducationHistory(Integer ideducationHistory) {
        this.ideducationHistory = ideducationHistory;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public String getEducatedPlaceName() {
        return this.educatedPlaceName;
    }
    
    public void setEducatedPlaceName(String educatedPlaceName) {
        this.educatedPlaceName = educatedPlaceName;
    }
    public String getDuringTime() {
        return this.duringTime;
    }
    
    public void setDuringTime(String duringTime) {
        this.duringTime = duringTime;
    }
    public String getAnddress() {
        return this.anddress;
    }
    
    public void setAnddress(String anddress) {
        this.anddress = anddress;
    }




}


