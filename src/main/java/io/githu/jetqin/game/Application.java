/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game;

public class Application {

    public static void main(String[] args) {
        Game game = new Game(1, 1, 100);
        game.print();
        game.printAdvance();
    }
}
