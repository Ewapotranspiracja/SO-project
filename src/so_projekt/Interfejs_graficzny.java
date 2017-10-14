package so_projekt;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Interfejs_graficzny extends JFrame {

    public Interfejs_graficzny() throws HeadlessException {
        this.setTitle("Projekt na systemy operacyjne");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        BoxLayout l = new BoxLayout(c, BoxLayout.Y_AXIS);
        c.setLayout(l);

        JButton Modul1 = new JButton("Stronicowanie");
        Modul1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });

        JButton Modul2 = new JButton("zarzadzenie procesorem");
        Modul2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });
        JButton Modul3 = new JButton("Modul nr 3");
        Modul3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });
        JButton Modul4 = new JButton("Modul nr 4");
        Modul4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });
        JButton Modul5 = new JButton("Modul nr 5");
        Modul5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });
        JButton Modul6 = new JButton("Modul nr 6");
        Modul6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });
        JButton Modul7 = new JButton("Modul nr 7");
        Modul7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });
        JButton Modul8 = new JButton("Modul nr 8");
        Modul8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okno = new JFrame("okno");
                okno.setSize(200, 200);
                okno.setLocationRelativeTo(null);
                okno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                okno.setVisible(true);
            }
        });

        ArrayList<JButton> Przyciski = new ArrayList<>();
        Przyciski.add(Modul1);
        Przyciski.add(Modul2);
        Przyciski.add(Modul3);
        Przyciski.add(Modul4);
        Przyciski.add(Modul5);
        Przyciski.add(Modul6);
        Przyciski.add(Modul7);
        Przyciski.add(Modul8);
        for (JButton a : Przyciski) {
            a.setAlignmentX(CENTER_ALIGNMENT);
            a.setMinimumSize(new Dimension(200, 100));
            a.setMaximumSize(new Dimension(200, 100));
            c.add(a);
        }

    }
}
