/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author Sebastian
 */
public class Cat extends Pet{
    private boolean isHunter;

    public Cat(String id, String name, String hairColor, Boolean isHunter) {
        super(id, name, hairColor);
        this.isHunter=isHunter;
    }
    @Override
    public String sound(){
        return "miauuut";
    }

    public boolean IsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }
    
}
