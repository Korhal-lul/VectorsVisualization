package br.com.main;

import br.com.view.MainLoop;
import processing.core.PApplet;

public class Main {
    public static void main(String[] args) {
        MainLoop ml = new MainLoop();
        PApplet.runSketch(new String[]{"AtomSimulator"}, ml);
    }
}
