/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule.stage;

import io.githu.jetqin.game.rule.FizzBuzzRule;

public class AdvanceFizzBuzzRule extends FizzBuzzRule {

    AdvanceFizzRule fizzRule;

    AdvanceBuzzRule buzzRule;

    public AdvanceFizzBuzzRule(){
        fizzRule = new AdvanceFizzRule();
        buzzRule = new AdvanceBuzzRule();
    }

    @Override
    public boolean match(int number){
        return fizzRule.match(number) && buzzRule.match(number);
    }
}
