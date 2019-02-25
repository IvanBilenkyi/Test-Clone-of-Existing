package com.app.core.ch08.sample;

import com.app.core.ch08.app01.data.Pen;
//import com.app.core.ch08.app01.data.Pen;

public class Main08 {

    public static void main(String[] args) {
        com.app.core.ch08.app02.data.Pen pen2 = new com.app.core.ch08.app02.data.Pen();
        pen2.write();

        com.app.core.ch08.app01.data.Pen pen1 = new com.app.core.ch08.app01.data.Pen();
        pen1.draw();

        Pen pen3 = new Pen();
    }
}
