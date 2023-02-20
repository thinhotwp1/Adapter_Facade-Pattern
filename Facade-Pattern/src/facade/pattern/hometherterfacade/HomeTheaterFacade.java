
package facade.pattern.hometherterfacade;

import java.awt.SystemColor;
import sun.awt.AWTAccessor;

 /* Mục đích của Facade là để đơn giản hóa, nó tách rời client ra khỏi 
hệ thống con bằng cách thao tác với lớp facade HomeTheaterFacade nhưng 
vẫn có thể thao tác trực tiếp với đèn hay điều hòa.*/

public class HomeTheaterFacade {
    String tenPhim = "Chưa chọn phim";
    Den den = new Den();
    DieuHoa dieuhoa = new DieuHoa();
    Loa loa = new Loa();
    Tivi tivi = new Tivi();
    DoAnVat doAnVat = new DoAnVat();
    
/* Thực tế nên để constructer để gán giá trị cho các object đèn, tivi,... để
tăng tính linh hoạt trong lúc realtime, ví dụ lựa chọn đèn ngủ hay đèn phòng,... */

    
    public void xemBoPhim(String tenPhim){
        System.out.println("===== Chuẩn bị xem phim ======");
        den.bat();
        dieuhoa.bat();
        loa.bat();
        tivi.bat();
        doAnVat.layDoAn();
        this.tenPhim=tenPhim;
        System.out.println("Xem phim "+ tenPhim);
    }
    
    public void xemPhimXong(){
        System.out.println("===== Xem phim xong ======");
        den.tat();
        dieuhoa.tat();
        loa.tat();
        tivi.tat();
        doAnVat.donDoAn();
    }
}
