package adapter_facade;

import adapter_facade.adapter.ChickenAdapter;
import adapter_facade.adapter.DuckAdapter;
import adapter_facade.adapter.TurkeyAdapter;
import adapter_facade.chicken.Chicken;
import adapter_facade.chicken.RunChicken;
import adapter_facade.duck.Duck;
import adapter_facade.duck.MallardDuck;
import adapter_facade.turkey.Turkey;
import adapter_facade.turkey.WildTurkey;

public class Adapter_Facade {

    public static void main(String[] args) {
/*  Adapter có thể implements một hoặc nhiều interface và chuyển đổi thành một  
    class phù hợp cho các đối tượng mới cần những method mới mà không cần phải
    sửa code cũ cũng như các interface cũ nên không làm ảnh hưởng tới những 
    class con cũ đã implements interface cũ trước đó */

        // Khai báo các loại vịt và gà tây, vịt giả và gà tây giả
        Duck malarDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        // Truyền loại gà tây hoặc loại vịt vào để thay đổi
        Duck turkeyClone = new TurkeyAdapter(wildTurkey);
        Turkey duckClone = new DuckAdapter(malarDuck);

        // Gà tây biến thành vịt
        System.out.println("===== Vịt real =====");
        System.out.println("malarDuck saying ....");
        malarDuck.quack();
        malarDuck.fly();
        System.out.println("===== Gà tây giả dạng vịt =====");
        System.out.println("turkeyClone saying ....");
        turkeyClone.quack();
        turkeyClone.fly();

        // Vịt biến thành gà tây
        System.out.println("===== Gà tây real =====");
        System.out.println("WildTurkey saying ....");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("===== Vịt giả dạng gà tây =====");
        System.out.println("duckClone saying ....");
        duckClone.gobble();
        duckClone.fly();

        // Gà ta giả mạo cả vịt và gà tây
        Chicken gaTa = new RunChicken();
        Duck chickenClone1 = new ChickenAdapter(gaTa);
        Turkey chickenClone2 = new ChickenAdapter(gaTa);
        System.out.println("===== Gà ta giả dạng vịt =====");
        System.out.println("chickenClone1 saying ....");
        chickenClone1.quack();
        chickenClone1.fly();
        System.out.println("===== Gà ta giả dạng gà tây =====");
        System.out.println("chickenClone2saying ....");
        chickenClone2.gobble();
        chickenClone2.fly();
        System.out.println("===== End the sample =====");
    }

}
