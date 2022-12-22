package prac5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class task1 {
    static int milan =0, madrid =0;
    static JFrame frame;
    static JPanel panel;
    static JButton button1;
    static JButton button2;
    static JLabel result,last,winner;

    static class ActListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Milan")) {
                milan++;
                last.setText("Last Scorer: AC Milan");
            }
            else {
                madrid++;
                last.setText("Last Scorer: Real Madrid");
            }
            if (milan > madrid)winner.setText("Winner: AC Milan");
            else if (madrid > milan)winner.setText("Winner: Real Madrid");
            else winner.setText("Winner: DRAW");
            result.setText("Result: "+milan+" X "+madrid);
        }
    }
    public static void main(String[] args) {
        frame = new JFrame("Прога");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,1));
        frame.setMinimumSize(new Dimension(300, 300));

        panel = new JPanel(new FlowLayout());

        frame.setBackground(Color.GRAY);

        button1 = new JButton("AC Milan");
        button1.setActionCommand("Milan");
        button2 = new JButton("Real Madrid");
        button2.setActionCommand("Madrid");
        result = new JLabel("Result: 0 X 0", JLabel.CENTER);
        last = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        winner = new JLabel("Winner: DRAW", JLabel.CENTER);

        ActListener action = new ActListener();
        button1.addActionListener(action);
        button2.addActionListener(action);

        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.getContentPane().add(result);
        frame.getContentPane().add(last);
        frame.getContentPane().add(winner);
        frame.pack();
        frame.setVisible(true);
    }
}
