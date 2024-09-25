package com.satellitesystem;

// Command for enabling solar panels
class SolarPanelActivationCommand implements Action {
    private final SatelliteController controller;

    public SolarPanelActivationCommand(SatelliteController controller) {
        this.controller = controller;
    }

    public void execute() throws SatelliteActionException {
        controller.enableSolarPanels();
    }
}
