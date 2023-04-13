package Structural.Decorator.decorators;

import Structural.Decorator.base.BasePizza;

public class Mushroom extends ToppingsDecorator {
    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 30;
    }

    
}
