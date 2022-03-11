import controllers.MainController;
import models.Hotel;
import views.MainView;
import views.SecondView;

public class Main {
    public static void main(String[] args) {

        MainView mainView=new MainView();
        SecondView secondView=new SecondView();
        Hotel hotel=new Hotel();
        MainController controller=new MainController(mainView,secondView,hotel);
    }
}
