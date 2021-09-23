package com.company;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private motherBoard motherBoard;

    public void powerUp() {
      theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        getMonitor().drawPixelAt(1200,50,"yellow");
    }

    public PC(Case theCase, Monitor monitor, com.company.motherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private com.company.motherBoard getMotherBoard() {
        return motherBoard;
    }
}
