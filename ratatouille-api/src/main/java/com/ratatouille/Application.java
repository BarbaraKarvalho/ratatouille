package com.ratatouille;

//criar dois atributos: quantity e amount(valorTotal)
//Receber via construtor
//Criar o metodo dado a quantidade e o amount dar um total
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello husband!");

        Meal meal = new Meal(2, "Chicken parm", 4, 12.0); //instância
        System.out.println(meal.toString());

        Meal meal1 = new Meal(4,"Fetuccine",2, 10.0);
        System.out.println(meal1.toString());
    }
}