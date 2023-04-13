package Structural.Decorator;

import Structural.Decorator.base.BasePizza;
import Structural.Decorator.base.Farmhouse;
import Structural.Decorator.decorators.ExtraCheese;
import Structural.Decorator.decorators.Mushroom;
import Structural.Decorator.decorators.ToppingsDecorator;

public class Client {
    public static void main(String[] args) {
        
        BasePizza farmHouseMushroom = new Mushroom(new Farmhouse());

        System.out.println(farmHouseMushroom.cost());

        BasePizza extraCheeseFarmHouseMush = new ExtraCheese(farmHouseMushroom);

        System.out.println(extraCheeseFarmHouseMush.cost());

        ToppingsDecorator addCheese = new ExtraCheese(extraCheeseFarmHouseMush);

        System.out.println(addCheese.cost());

    }
}
