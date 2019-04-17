/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game;

import io.githu.jetqin.game.rule.*;
import io.githu.jetqin.game.rule.stage.AdvanceBuzzRule;
import io.githu.jetqin.game.rule.stage.AdvanceFizzBuzzRule;
import io.githu.jetqin.game.rule.stage.AdvanceFizzRule;

import java.util.Arrays;

public class Game {

    private int start;

    private int step;

    private int end;

    public Game(int start, int step, int end) {
        this.start = start;
        this.step = step;
        this.end = end;
    }

    public void print(){
        PrintUtil util = new PrintUtil();
        util.setRules(Arrays.asList(new Rule[]{new FizzBuzzRule(), new FizzRule(), new BuzzRule()}));
        for(int index = start; index <= end; index=index+step){
            util.print(index);
        }
    }

    public void printAdvance(){
        PrintUtil util = new PrintUtil();
        util.setRules(Arrays.asList(new Rule[]{new AdvanceFizzBuzzRule(), new AdvanceFizzRule(), new AdvanceBuzzRule()}));
        for(int index = start; index <= end; index=index+step){
            util.print(index);
        }
    }

    public int getStart() {
        return start;
    }

    public int getStep() {
        return step;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
