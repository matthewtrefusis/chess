package com.matthewtrefusis;

import java.awt.*;
import javax.swing.*;
import com.matthewtrefusis.Boards.Board;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1000, 1000));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        Board board = new Board();
        frame.add(board);

        frame.setVisible(true);
    }
}