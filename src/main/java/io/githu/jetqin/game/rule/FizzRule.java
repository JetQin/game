/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule;

public class FizzRule implements Rule {

    public boolean match(int number) {
        return number % 3 == 0;
    }

    public void print(int number) {
        System.out.println("Fizz");
    }

}
