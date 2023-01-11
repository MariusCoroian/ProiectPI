/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coroi
 */
public class Utilizator {

    public Utilizator(String email, String parola) {
        this.email = email;
        this.parola = parola;
    }
    String email;
        String parola;

    public Utilizator() {
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return "Utilizator{" + "email=" + email + ", parola=" + parola + '}';
    }
    
    
        
        
}
