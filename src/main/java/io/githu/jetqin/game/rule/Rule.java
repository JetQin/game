/*
 * Copyright (c) 2019 . All rights reserved.
 * Author: JetQin
 * Email: qinjet@gmail.com
 *
 */

package io.githu.jetqin.game.rule;

public interface Rule {

    boolean match(int number);

    void print(int number);
}
