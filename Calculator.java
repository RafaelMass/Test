package com.mycompany.calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafa
 */
public class Calculator {
    public static void main(String[] args) {
        Operaciones operacion1 = new Operaciones();
        System.out.println("La suma es: " + operacion1.Suma(5, 3));
        System.out.println("La resta es: " + operacion1.Resta(5, 3));
        System.out.println("La multiplicación es: " + operacion1.Multiplicacion(5, 3));
        System.out.println("La división es: " + operacion1.Division(5, 3));
    }   
}