/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

/**
 *
 * @author farid
 */
public class Bebidas implements Costo {

    private String nombre, contenido;

    public Bebidas(String nombre, String cantidad) {
        this.nombre = nombre;
        this.contenido = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String cantidad) {
        this.contenido = cantidad;
    }

    @Override
    public double costo() {
        double precio=0;
        switch (nombre){
            case "CocaCola"->{
                switch(contenido){
                    case "350ml"->{
                        precio=15;
                    }
                    case "500ml"->{
                        precio=25;
                    }
                    case "1l"->{
                        precio=35;
                    }
                    case "2l"->{
                        precio=50;
                    }
                }
            }
            case "Pepsi"->{
                switch(contenido){
                    case "350ml"->{
                        precio=13;
                    }
                    case "500ml"->{
                        precio=23;
                    }
                    case "1l"->{
                        precio=30;
                    }
                    case "2l"->{
                        precio=45;
                    }
                }
            }
            case "DelValle"->{
                switch(contenido){
                    case "600ml"->{
                        precio=12.50;
                    }
                }
            }
            case "FuzeTea"->{
                switch(contenido){
                    case "600ml"->{
                        precio=16;
                    }
                }
            }
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Bebida\nNombre:" + nombre + "\nContenido:" + contenido;
    }

}
