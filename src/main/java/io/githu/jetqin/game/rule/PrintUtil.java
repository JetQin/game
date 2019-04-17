/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule;

import java.util.ArrayList;
import java.util.List;

public class PrintUtil {

    List<Rule> rules  = new ArrayList<Rule>();

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public void print(int number){
        boolean match;
        for(Rule rule : rules){
            match = rule.match(number);
            if(match){
                rule.print(number);
                return;
            }
        }
        System.out.println(number);
    }
}
