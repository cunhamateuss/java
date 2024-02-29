/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author a
 */
@Entity
public class Utilizador implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Basic
    private String nome;
    private String email;
    private String psswd;

    public Utilizador(int id, String nome, String email, String psswd) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.psswd = psswd;
    }

    
    public Utilizador() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }
    
    
}
