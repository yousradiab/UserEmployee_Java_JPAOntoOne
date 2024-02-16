package org.example.useremployee.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UniCode {

    //Step4. Opret nu en ny model klasse, vi kunne kalde den Unicode, som skal mappes til MySql database med JPA.
    //
    //Hav mindst 2 properties i klassen.
    //
    //int unicode og char bogstav
    //
    //og måske String description, så man kan skrive en kommentar udfor sine yndlings bogstaver.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int unicode;
    private char letter;
    private String description;

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getaLetter() {
        return letter;
    }

    public void setaLetter(char aChar) {
        this.letter = aChar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
