package software.ulpgc.kata3;

import software.ulpgc.kata3.clean.control.Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {

    private final Map<String, Command> commands;

    public MainFrame() throws HeadlessException {
        this.setTitle("Statistics");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(menu());
        commands = new HashMap<>();
    }

    private JPanel menu() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(toggle());
        return panel;
    }

    private JButton toggle() {
        JButton toggle = new JButton("toggle");
        toggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commands.get("toggle").excute();
            }
        });
        return toggle;
    }
}
