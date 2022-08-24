/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Thamyres
 */
public class Project {
    
    private int idProjects;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    public Project() {
      this.createdAt = new Date();
      this.updatedAt = new Date();
    }
   

    public Project(int id, String name, String description, Date createdAt, Date updatedAt) {
        this.idProjects = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return idProjects;
    }

    public void setId(int id) {
        this.idProjects = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }    

    @Override
    public String toString() {
        return this.name;
    }

}
