/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

/**
 *
 * @author farid
 */
public class Pizza implements Costo {

    private String tamaño, nombre, ingredientesE;

    public Pizza(String tamaño, String nombre, String ingredientesE) {
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.ingredientesE = ingredientesE;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientesE() {
        return ingredientesE;
    }

    public void setIngredientesE(String ingredientesE) {
        this.ingredientesE = ingredientesE;
    }

    @Override
    public double costo() {
        double precio = 40;
        switch (this.tamaño) {
            case "Chica" -> {
                precio += 10;
            }
            case "Mediana" -> {
                precio += 30;
            }
            case "Grande" -> {
                precio += 40;
            }
        }
        switch (this.nombre) {
            case "Peperoni" -> {
                precio += 30;
            }
            case "Chanpiñones" -> {
                precio += 40;
            }
            case "Hawaiana" -> {
                precio += 50;
            }
            case "Queso" -> {
                precio += 35;
            }
        }
        if (!this.ingredientesE.isEmpty()){
            switch(this.ingredientesE){
                case "Peperoni"->{
                    precio+=15;
                }
                case "Queso"->{
                    precio+=15;
                }
                case "Champiñones"->{
                    precio+=20;
                }
                case "Jamon y piña"->{
                    precio+=25;
                }
            }
        }
        return precio;
    }

    @Override
    public String toString() {
        String ie = "";
        if (!this.ingredientesE.isEmpty()) {
            ie = "\nIngrediente Extra: " + ingredientesE;
        }
        return "Pizza\nTamaño: " + tamaño + "\nTipo: " + nombre + ie;
    }

}
