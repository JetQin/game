/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule;

public class FizzBuzzRule implements Rule {

    private FizzRule fizzRule;

    private BuzzRule buzzRule;

    public FizzBuzzRule(){
        fizzRule = new FizzRule();
        buzzRule = new BuzzRule();
    }

    public boolean match(int number) {
        return fizzRule.match(number) && buzzRule.match(number);
    }

    public void print(int number) {
        System.out.println("FizzBuzz");
    }
}
