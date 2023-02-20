/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_facade.adapter;

import adapter_facade.chicken.Chicken;
import adapter_facade.duck.Duck;
import adapter_facade.turkey.Turkey;

/**
 *
 * @author Administrator
 */
public class DuckAdapter implements Turkey{
    
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
    

    @Override
    public void gobble() {
        duck.quack();
    }
    
    @Override
    public void fly() {
        duck.fly();
    }

}
