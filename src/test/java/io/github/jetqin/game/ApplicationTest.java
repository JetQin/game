/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.github.jetqin.game;

import io.githu.jetqin.game.rule.BuzzRule;
import io.githu.jetqin.game.rule.FizzBuzzRule;
import io.githu.jetqin.game.rule.FizzRule;
import io.githu.jetqin.game.rule.Rule;
import io.githu.jetqin.game.rule.stage.AdvanceBuzzRule;
import io.githu.jetqin.game.rule.stage.AdvanceFizzBuzzRule;
import io.githu.jetqin.game.rule.stage.AdvanceFizzRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {

    @Test
    void testFizzRule() {
        Rule rule = new FizzRule();
        assertTrue(rule.match(3));
    }

    @Test
    void testBuzzRule() {
        Rule rule = new BuzzRule();
        assertTrue(rule.match(5));
    }

    @Test
    void testFizzBuzzRule() {
        Rule rule = new FizzBuzzRule();
        assertTrue(rule.match(15));
    }


    @Test
    void testAdvanceFizzBuzzRule() {
        Rule rule = new AdvanceFizzBuzzRule();
        assertTrue(rule.match(53));
    }

    @Test
    void testAdvanceBuzzRule() {
        Rule rule = new AdvanceBuzzRule();
        assertTrue(rule.match(51));
    }

    @Test
    void testAdvanceFizzRule() {
        Rule rule = new AdvanceFizzRule();
        assertTrue(rule.match(13));
    }
}
