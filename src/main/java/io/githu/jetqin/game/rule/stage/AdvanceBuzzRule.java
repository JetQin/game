/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule.stage;

import io.githu.jetqin.game.rule.BuzzRule;

public class AdvanceBuzzRule extends BuzzRule {

    @Override
    public boolean match(int number){
        boolean match = super.match(number);
        boolean contain = String.valueOf(number).indexOf("5") > -1;
        return  match || contain;
    }
}
