package com.matthewtrefusis.Boards;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public int tileSize = 85;

    int rows = 8;
    int cols = 8;

    public Board() {
        this.setPreferredSize(new Dimension(tileSize * cols, tileSize * rows));
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if ((row + col) % 2 == 0) {
                    g2d.setColor(new Color(119, 172, 191));
                } else {
                    g2d.setColor(new Color(184, 217, 171));
                }
                g2d.fillRect(col * tileSize, row * tileSize, tileSize, tileSize);
            }
        }
    }
    
}
