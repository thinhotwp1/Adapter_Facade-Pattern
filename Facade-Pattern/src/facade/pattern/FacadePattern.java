/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade.pattern;

import facade.pattern.hometherterfacade.HomeTheaterFacade;

/**
 *
 * @author Administrator
 */
public class FacadePattern {

    public static void main(String[] args) {
        
        HomeTheaterFacade xemPhimTainha = new HomeTheaterFacade();
        xemPhimTainha.xemBoPhim("Titanic");
        xemPhimTainha.xemPhimXong();
    }
    
}
