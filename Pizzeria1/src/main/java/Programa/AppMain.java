/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

import Pizzeria.*;
import Excepciones.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author farid
 */
public class AppMain {

    static Scanner teclado = new Scanner(System.in);
    static Pizzeria pizzeria;

    public static void main(String[] args) {
        int opc = 0;
        boolean rep;
        new Usuario();
        do {
            rep = false;
            try {
                System.out.println("¿Que deseas hacer?\n1.-Ordenar\n2.-Salir");
                opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        Ordenar();
                    }
                    case 2 -> {
                        System.out.println("Vuelva pronto =D");
                    }
                    default ->
                        throw new OpcInvalidaException("Porfavor elija una opcion valida");

                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                rep = true;
            } catch (OpcInvalidaException e1) {
                System.out.println(e1.getMessage());
                rep = true;
            }

        } while (opc != 2 || rep);
    }

    public static void Ordenar() {
        int opc;
        boolean rep;
        Orden orden = new Orden();
        do {
            rep = false;
            try {
                System.out.println("¿De que pizzeria desea ordenar?\n1.-Dominos Pizza\n2.-Peter Piper Pizza");
                opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        Empleados[] e = {
                            new Cocinero("Juanito Alcachofa", "29rfni4u9ef"),
                            new Repartidor("Susan uwu", "j494n93w")
                        };
                        pizzeria = new Pizzeria("Dominos Pizza", "640,Avenida De las Torres, 32573 INFONAVIT Juárez Nuevo, Chihuahua", "656 624 7072", e);
                    }
                    case 2 -> {
                        Empleados[] e = {
                            new Cocinero("Hanzo Acosta", "682ncdh5u"),
                            new Repartidor("Diego Lopez", "48ge98gj9")
                        };
                        pizzeria = new Pizzeria("Peter Piper Pizza", "zaragoza Juárez, Chihuahua", "656 624 6719", e);
                    }
                    default ->
                        throw new OpcInvalidaException("Porfavor elija una opcion valida");

                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                rep = true;
            } catch (OpcInvalidaException e1) {
                System.out.println(e1.getMessage());
                rep = true;
            }
        } while (rep);
        orden.setPizzeria(pizzeria);
        do {
            rep = false;
            try {
                System.out.println("¿Que desea ordenar? \n1.-Combo\n2.-Pizza\n3.-Bebida");
                opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        orden.setCombo(ordenarCombo());
                    }
                    case 2 -> {
                        orden.setP(ordenarPizza());
                    }
                    case 3 -> {
                        orden.setB(ordenarBebida());
                    }
                    default ->
                        throw new OpcInvalidaException("Porfavor elija una opcion valida");

                }
                System.out.println("¿Desea agregar algo más?\n1.-Si\n2.-No");
                opc = teclado.nextInt();
                if (opc == 1) {
                    rep = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                rep = true;
            } catch (OpcInvalidaException e1) {
                System.out.println(e1.getMessage());
                rep = true;
            }
        } while (rep);
        orden.ImprimirTicket();
    }

    public static Combos ordenarCombo() {
        Combos comboTemp = null;
        int opc;
        boolean rep;
        do {
            rep = false;
            try {
                System.out.println("¿Que combo deseas ordenar?"
                        + "\n1.-Combo especial: 1 pizza mediana de peperoni y una Cocacola de 1l por $110"
                        + "\n2.-Combo Individual: una pizza chica de champiñones y un FuzeTea de 600ml por $90"
                        + "\n3.-Combo familiar: una pizza Grande hawaiana mas una coca cola de 2l por $150");
                opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        comboTemp = new Combos("Combo especial");
                    }
                    case 2 -> {
                        comboTemp = new Combos("Combo individual");
                    }
                    case 3 -> {
                        comboTemp = new Combos("Combo familiar");
                    }
                    default ->
                        throw new OpcInvalidaException("Porfavor Ingresa una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                rep = true;
            } catch (OpcInvalidaException e1) {
                System.out.println(e1.getMessage());
                rep = true;
            }
        } while (rep);
        return comboTemp;
    }

    public static Pizza ordenarPizza() {
        Pizza pizzaTemp = null;
        String tam = "", nombre = "", ingE = "";
        int opc;
        boolean rep;
        do {
            rep = false;
            try {
                System.out.println("¿De que tamaño quieres la pizza?\n1.-Chica\n2.-Mediana\n3.-Grande");
                opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        tam = "Chica";
                    }
                    case 2 -> {
                        tam = "Mediana";
                    }
                    case 3 -> {
                        tam = "Grande";
                    }
                    default ->
                        throw new OpcInvalidaException("Ingresa una opcion valida");
                }
                System.out.println("¿Que tipo de pizza va a querer?\n1.-Peperoni\n2.-Champiñones\n3.-Hawaiana\n4.-Queso");
                opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        nombre = "Peperoni";
                    }
                    case 2 -> {
                        nombre = "Champiñones";
                    }
                    case 3 -> {
                        nombre = "Hawaiana";
                    }
                    case 4 -> {
                        nombre = "Queso";
                    }
                    default ->
                        throw new OpcInvalidaException("Ingresa una opcion valida");
                }
                System.out.println("¿Quiere agregar un ingrediente extra?1.-Si 2.-No");
                opc = teclado.nextInt();
                if (opc == 1) {
                    System.out.println("¿Que ingrediente extra va a querer?\n1.-Peperoni\n2.-Champiñones\n3.-Jamon y piña\n4.-Queso");
                    opc = teclado.nextInt();
                    switch (opc) {
                        case 1 -> {
                            ingE = "Peperoni";
                        }
                        case 2 -> {
                            ingE = "Champiñones";
                        }
                        case 3 -> {
                            ingE = "Jamon y piña";
                        }
                        case 4 -> {
                            ingE = "Queso";
                        }
                        default ->
                            throw new OpcInvalidaException("Ingresa una opcion valida");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                rep = true;
            } catch (OpcInvalidaException e1) {
                System.out.println(e1.getMessage());
                rep = true;
            }
        } while (rep);
        pizzaTemp = new Pizza(tam, nombre, ingE);
        return pizzaTemp;
    }

    public static Bebidas ordenarBebida() {
        Bebidas bebidaTemp = null;
        String nom = "", cont = "";
        int opc, opc2;
        boolean rep;
        do {
            rep = false;
            try {
                System.out.println("¿Que bebida quiere ordenar?\n1.-CocaCola\n2.-Pepsi\n3.-DelValle\n4.-FuzeTea");
                opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        nom = "CocaCola";
                        System.out.println("¿De que tamaño lo quiere?\n1.-350ml\n2.-500ml\n3.-1l\n4.-2l");
                        opc2 = teclado.nextInt();
                        switch (opc2) {
                            case 1 -> {
                                cont = "350ml";
                            }
                            case 2 -> {
                                cont = "500ml";
                            }
                            case 3 -> {
                                cont = "1l";
                            }
                            case 4 -> {
                                cont = "2l";
                            }
                            default ->
                                throw new OpcInvalidaException("Porfavor ingresa una opcion valida");
                        }
                    }
                    case 2 -> {
                        nom = "Pepsi";
                        System.out.println("¿De que tamaño lo quiere?\n1.-350ml\n2.-500ml\n3.-1l\n4.-2l");
                        opc2 = teclado.nextInt();
                        switch (opc2) {
                            case 1 -> {
                                cont = "350ml";
                            }
                            case 2 -> {
                                cont = "500ml";
                            }
                            case 3 -> {
                                cont = "1l";
                            }
                            case 4 -> {
                                cont = "2l";
                            }
                            default ->
                                throw new OpcInvalidaException("Porfavor ingresa una opcion valida");
                        }
                    }
                    case 3 -> {
                        nom = "DelValle";
                        cont = "600ml";
                    }
                    case 4 -> {
                        nom = "FuzeTea";
                        cont = "600ml";
                    }
                    default ->
                        throw new OpcInvalidaException("Porfavor ingresa una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                rep = true;
            } catch (OpcInvalidaException e1) {
                System.out.println(e1.getMessage());
                rep = true;
            }
        } while (rep);
        bebidaTemp=new Bebidas(nom, cont);
        return bebidaTemp;
    }
}
