package Structural.Decorator.decorators;

import javax.swing.text.TabExpander;

import Structural.Decorator.base.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost() + 20;
    }

}
