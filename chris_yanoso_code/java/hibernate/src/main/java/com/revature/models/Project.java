package com.revature.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "projects")
public class Project implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_budget")
    private double projectBudget;


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
//    @OneToOne(mappedBy = "project_id")
//    private ProjectTeam projectTeam;
//
//    public ProjectTeam getProjectTeam() {
//        return projectTeam;
//    }
//
//    public void setProjectTeam(ProjectTeam projectTeam) {
//        this.projectTeam = projectTeam;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(double projectBudget) {
        this.projectBudget = projectBudget;
    }
}
