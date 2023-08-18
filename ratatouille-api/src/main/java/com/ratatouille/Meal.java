package com.ratatouille;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//revert commit 2
public class Meal {
    private final long id;
    private final String description;
    private final Date createAt;
    private final int quantity;
    private final double amount;
    private List<Ingredient> ingredients;

    //Construtor: modificador de acesso + nome da classe + o que ele recebe (dentro dos parametros)
    //Sempre tem o mesmo nome da classe
    //Construtor assinado, com parametros
    public Meal(long id, String description, int quantity, double amount){
        this.createAt = new Date();
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.amount = amount;
        this.ingredients = new ArrayList<>();
    }
    //um metodo tem a estrutura: modificador de acesso + tipo de retorno(sim/não) + nome
    //() tudo o que queremos receber de fora - dentro tem o tipo e descrição

    public double getTotal(){
        return this.quantity * this.amount;
    }
    public long getId(){
        return this.id;
    }
    public String getDescription(){
        return this.description;
    }
    public Date getCreateAt(){
        return this.createAt;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getAmount(){
        return this.amount;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
    public void addIngredients(List<Ingredient> ingredients){
        this.ingredients = ingredients;
    }
    @Override //Toda a classe criada, tem uma classe como base e tem o nome obj - Sobescrevendo porque não quer usar o que sempre existe na base obj
    public String toString(){
        return " id: " + this.id +
                " description: " + this.description +
                " createAt: " + this.createAt +
                " quantity: " + this.quantity +
                " amount: " + this.amount +
                " total: " + this.getTotal();
    }
}


