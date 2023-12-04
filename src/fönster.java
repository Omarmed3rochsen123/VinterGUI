import javax.swing.*;

public class fönster {

    public fönster(int sizeX,int sizeY){

        JFrame fönster = new JFrame();
        fönster.setVisible(true);
        fönster.setResizable(false);
        fönster.setBounds(500,200,sizeX,sizeY);
        fönster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}