package br.com.controler;

import processing.core.PApplet;

import java.awt.*;

public class Squares {
    PApplet view;
    int step;
    Color color;
    int alpha;

    public Squares(PApplet view, int step) {
        this.view = view;
        this.step = step;
    }

    public void draw() {
        float halfWid = view.width / 2;
        float halfHei = view.height / 2;

        view.fill(255);
        view.stroke(70);

        for (int i = step; i <= halfHei; i += step) {
            view.line(halfWid * -1, i, halfWid, i);
            view.line(halfWid * -1, i * -1, halfWid, i * -1);
        }

        for (int i = step; i <= halfWid; i += step) {
            view.line(i, halfHei * -1, i, halfHei);
            view.line(i * -1, halfHei * -1, i * -1, halfHei);
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
}
