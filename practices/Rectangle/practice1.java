package practices.Rectangle;

import javax.swing.JFrame;

public class practice1 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("An empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}

