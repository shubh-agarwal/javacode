package com.company;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private motherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, com.company.motherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public com.company.motherBoard getMotherBoard() {
        return motherBoard;
    }
}
