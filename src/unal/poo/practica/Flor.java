/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author Fabian Giraldo
 */
public class Flor extends Thing
 {
    public Flor(City city, int i, int i1) {
        super(city, i, i1);
        setIcon(new Bicon("C:\\Users\\Estudiante\\Downloads\\grass.png"));
         
    }
    
    
}
