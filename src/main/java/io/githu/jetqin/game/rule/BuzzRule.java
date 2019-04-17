/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule;

public class BuzzRule implements Rule {

    public boolean match(int number) {
        return number % 5 == 0;
    }

    public void print(int number){
        System.out.println("Buzz");
    }
}
