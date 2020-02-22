package br.com.controler;

import processing.core.PApplet;

public class MainLines {
    public static void draw(PApplet view){
        float halfWid = view.width / 2;
        float halfHei = view.height / 2;

        view.stroke(61, 129, 180);
        //X axis
        view.line(halfWid * -1, 0, halfWid, 0);

        view.stroke(250, 125, 104);
        //Y axis
        view.line(0, halfHei * -1, 0, halfHei);

    }
}
