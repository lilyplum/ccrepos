package com.codecool.ftd.logic.command;

import com.codecool.ftd.data.Drone;

public interface Movement {
    String getCommand();

    void apply(Drone drone);
}
