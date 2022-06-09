/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

import java.util.ArrayList;

/**
 *
 * @author farid
 */
public class Orden implements Costo {

    private int numOrden;
    static int No = 1;
    private ArrayList<Pizza> p = new ArrayList();
    private ArrayList<Bebidas> b = new ArrayList();
    private ArrayList<Combos> combo = new ArrayList();
    private Pizzeria pizzeria;

    public Orden() {
        this.numOrden = No;
        No++;
    }

    public ArrayList<Pizza> getP() {
        return p;
    }

    public void setP(Pizza p) {
        this.p.add(p);
    }

    public ArrayList<Bebidas> getB() {
        return b;
    }

    public void setB(Bebidas b) {
        this.b.add(b);
    }

    public Pizzeria getPizzeria() {
        return pizzeria;
    }

    public void setPizzeria(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }

    public ArrayList<Combos> getCombo() {
        return combo;
    }

    public void setCombo(Combos combo) {
        this.combo.add(combo);
    }

    public void ImprimirTicket() {
        System.out.println("Numero de Orden " + numOrden);
        System.out.println(pizzeria);
        for (Empleados empleados : pizzeria.getPersonal()) {
            if (empleados instanceof Cocinero) {
                System.out.println("Cocinero: " + empleados.getNombre());
            }
        }
        for (Empleados empleados : pizzeria.getPersonal()) {
            if (empleados instanceof Repartidor) {
                System.out.println("Repartidor: " + empleados.getNombre());
            }
        }
        for (Pizza pizza : p) {
            System.out.println(pizza);
        }

        for (Bebidas bebidas : b) {
            System.out.println(bebidas);
        }

        for (Combos combos : combo) {
            System.out.println(combos);
        }

        System.out.println("Sería un total de: " + costo());
    }

    @Override
    public double costo() {
        double precioF = 0;
        for (Pizza pizza : p) {
            precioF += pizza.costo();
        }

        for (Bebidas bebidas : b) {
            precioF += bebidas.costo();
        }

        for (Combos combos : combo) {
            precioF += combos.costo();
        }

        return precioF;
    }

}
