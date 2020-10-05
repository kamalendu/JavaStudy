package org.selfstudy.javastudy.model;

import lombok.Data;
import lombok.Getter;

@Getter
public enum State {
    CA("California","CA",Zone.WEST),
    GA("Georgia","GA",Zone.EAST),
    TX("Texas","TX",Zone.SOUTH),
    NH("New Hampshire","NH",Zone.NORTH_EAST);

    private String stateName;
    private String stateCode;
    private Zone zone;

    State(String stateName, String stateCode, Zone zone){
        this.stateName = stateName;
        this.stateCode = stateCode;
        this.zone = zone;
    }
    private enum Zone{
        NORTH_EAST("North East Zone"),
        EAST("East Zone"),
        WEST("West Zone"),
        SOUTH("South Zone");

        private String zoneName;
        Zone(String zoneName){
            this.zoneName=zoneName;
        }
    }
}

