package com.satellitesystem;

class OrientationChangeCommand implements Action {
    private final SatelliteController controller;
    private final SatelliteOrientation newOrientation;

    public OrientationChangeCommand(SatelliteController controller, SatelliteOrientation newOrientation) {
        this.controller = controller;
        this.newOrientation = newOrientation;
    }

    public void execute() {
        controller.adjustOrientation(newOrientation);
    }
}