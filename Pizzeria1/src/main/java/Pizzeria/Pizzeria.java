/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

/**
 *
 * @author farid
 */
public class Pizzeria {
    private String nombre, direccion, telefono;
    private Empleados personal[];

    public Pizzeria(String nombre, String direccion, String telefono, Empleados[] personal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personal = personal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleados[] getPersonal() {
        return personal;
    }

    public void setPersonal(Empleados[] personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Pizzeria \nNombre:" + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono;
    }
    
}
