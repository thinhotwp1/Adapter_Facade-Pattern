/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_facade.chicken;

/**
 *
 * @author Administrator
 */
public class RunChicken implements Chicken{

    @Override
    public void cucTac() {
        System.out.println("Cục tác !");
    }

    @Override
    public void fly() {
        System.out.println("Có cánh nhưng không bay được :(( ");
    }
    
}
