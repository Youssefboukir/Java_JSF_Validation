/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@RequestScoped
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @NotNull(message = "Date ne peut pas être nulle")
    String date;

    @NotNull(message = "CNE ne peut pas être nulle")
    @Size(min = 6)
    String CNE;
    @Size(max = 10)
    @NotNull(message = "ville ne peut pas être nulle")
    String ville;
    
    @NotNull(message = "Bourse ne peut pas être nulle")
    float bourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public float getBourse() {
        return bourse;
    }

    public void setBourse(float bourse) {
        this.bourse = bourse;
    }

}
