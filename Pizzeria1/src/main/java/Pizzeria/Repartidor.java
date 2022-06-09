/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

/**
 *
 * @author farid
 */
public class Repartidor extends Empleados{
    String puesto;

    public Repartidor( String nombre, String RFC) {
        super(nombre, RFC);
        this.puesto = "Repartidor";
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ puesto;
    }
}
