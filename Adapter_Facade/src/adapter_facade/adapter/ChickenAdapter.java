/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_facade.adapter;

import adapter_facade.chicken.Chicken;
import adapter_facade.duck.Duck;
import adapter_facade.turkey.Turkey;

/*  Adapter có thể implements một hoặc nhiều interface và chuyển đổi thành một  
    class phù hợp cho các đối tượng mới cần những method mới mà không cần phải sửa 
    code cũ cũng như các interface cũ nên không làm ảnh hưởng tới những class 
    con cũ đã implements interface cũ trước đó */

public class ChickenAdapter implements Duck, Turkey { 
// chú gà giả mạo thành cả vịt và gà tây hay bộ chuyển đổi gà thành Duck, Turkey 

    Chicken chicken;

    public ChickenAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void quack() {
        chicken.cucTac();
        System.out.println("Ta là vịt đây kaka");
    }

    @Override
    public void fly() {
        chicken.fly();
    }

    @Override
    public void gobble() {
        chicken.cucTac();
        System.out.println("Ta là gà tây real ");
    }

}
