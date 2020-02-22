package br.com.view;

import br.com.controler.MainLines;
import br.com.controler.Squares;
import processing.core.PApplet;


public class MainLoop extends PApplet {
    Squares squares;

    @Override
    public void settings() {
        size(1266, 700);

        squares = new Squares(this, 40);
    }

    @Override
    public void setup(){
        frameRate(60);
        background(0);
        surface.setResizable(true);
    }

    @Override
    public void draw(){
        //Middle is the new [0,0]
        translate(width / 2, height /2);
        squares.draw();
        MainLines.draw(this);
    }
}
