/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule.stage;

import io.githu.jetqin.game.rule.FizzRule;

public class AdvanceFizzRule extends FizzRule {

    @Override
    public boolean match(int number){
        boolean match = super.match(number);
        boolean contain = String.valueOf(number).indexOf("3") > -1;
        return  match || contain;
    }
}
