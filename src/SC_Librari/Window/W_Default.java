package SC_Librari.Window;

import javax.swing.*;
import java.awt.*;

/**
 * Создает  стандартное окно без наполнения
 *
 */
public class W_Default implements W_Null {

    public W_Default(){



        JFrame.setDefaultLookAndFeelDecorated(false);
        this.buildDefault();};


private JFrame frame ;
public JFrame getFrame(){return frame;}
protected void setFrame(JFrame newFrame){ frame = newFrame;};
protected void setFrame(){frame = new JFrame();};


    public static final int UP_LEFT  = 0 ,
                            UP_CENTER= 1 ,
                            UP_RIGHT = 2 ,
                            CENTER_LEFT = 3 ,
                            CENTER = 4 ,
                            CENTER_RIGHT = 5 ,
                            DOWN_LEFT = 6 ,
                            DOWN_CENTER = 7 ,
                            DOWN_RIGHT = 8 ;







//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public boolean MovingWindow (int Param ){

    int screenW , screenH ;

    /**
     * Зона за экраном
     */
    int InvisibleZone = 0;

    {
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
            screenW = sSize.width ;
            screenH = sSize.height;

    }

int X =0 , Y = 0 ,W = this.getFrame().getWidth() , H = this.getFrame().getHeight();

    switch(Param) {

        case W_Default.UP_LEFT :
            break;
        case W_Default.UP_CENTER :
            X = (screenW / 2) - (W / 2) ;
            break;
        case W_Default.UP_RIGHT:
            X = screenW - W ;
            break;
        case W_Default.CENTER_LEFT :
            Y = (screenH / 2) - (Y/2) ;
            break;
        case W_Default.CENTER :
            Y = (screenH / 2) - (Y/2) ;
            X = (screenW / 2) - (W / 2)  ;
            break;
        case W_Default.CENTER_RIGHT :
             X = screenW - W ;
             Y = (screenH / 2) - (Y/2) ;
             break;
        case W_Default.DOWN_LEFT :
             Y = screenH - H ;
            break;
        case W_Default.DOWN_CENTER :
            X = (screenW / 2) - (W / 2) ;
            Y = screenH - H ;
            break;
        case W_Default.DOWN_RIGHT :
            X = screenW - W ;
            Y = screenH - H ;
            break;





     default: break;
    }
return MovingWindow(X , Y);


}


public boolean MovingWindow (int X , int Y){

 this.getFrame().setBounds(X,Y,this.getFrame().getWidth(),this.getFrame().getHeight());
return true;
}





//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    /**
     * Строит панель
     * @return Успех
     */
    protected boolean buildDefault(){

this.setFrame();
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.pack();
frame.setVisible(true);



return true;
}


}
