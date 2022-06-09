/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

/**
 *
 * @author farid
 */
public class Combos implements Costo{
    private String nomCombo;
    private Pizza pizza;
    private Bebidas bebida;
    double precio;

    public Combos(String nomCombo) {
        this.nomCombo = nomCombo;
        switch (this.nomCombo){
            case "Combo especial"->{
                this.pizza=new Pizza("Mediana", "Peperoni", "");
                this.bebida=new Bebidas("CocaCola", "1l");
                precio=110;
            }
            case "Combo individual"->{
                this.pizza=new Pizza("Chica", "Champiñones", "");
                this.bebida=new Bebidas("FuzeTea", "600ml");
                precio=90;
            }
            case "Combo familiar"->{
                this.pizza=new Pizza("Mediana", "Hawaiana", "");
                this.bebida=new Bebidas("CocaCola", "2l");
                precio=150;
            }
        }
    }

    public String getNomCombo() {
        return nomCombo;
    }

    public void setNomCombo(String nomCombo) {
        this.nomCombo = nomCombo;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Bebidas getBebida() {
        return bebida;
    }

    public void setBebida(Bebidas bebida) {
        this.bebida = bebida;
    }

    @Override
    public double costo() {
        return precio;
    }

    @Override
    public String toString() {
        return "\n"+nomCombo + "\n" + pizza + "\n" + bebida;
    }
    
    
}
