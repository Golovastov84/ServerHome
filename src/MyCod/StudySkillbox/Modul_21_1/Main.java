package MyCod.StudySkillbox.Modul_21_1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);

        /*
//      задание формы вручную
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Click Me :)"));*/

        frame.add(new MainForm().getMainPanel());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
