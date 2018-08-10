package Brick;
import  javax.swing.JFrame;

public class Main {

    public static void  main(String[] args)
    {
        JFrame obj = new JFrame();
        Game game =  new Game();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Break out");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(game);
        obj.setVisible(true);
    }
}
