//package com.WorldOfMCQs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("World of MCQs");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to World of MCQs!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label);

        JButton startButton = new JButton("Start Quiz");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quiz.startQuiz();
            }
        });
        frame.add(startButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setVisible(true);
    }
}
