package com.satellitesystem;

class SolarPanelDeactivationCommand implements Action {
    private final SatelliteController controller;

    public SolarPanelDeactivationCommand(SatelliteController controller) {
        this.controller = controller;
    }

    public void execute() {
        controller.disableSolarPanels();
    }
}