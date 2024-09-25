package com.satellitesystem;

class DataCaptureCommand implements Action {
    private final SatelliteController controller;

    public DataCaptureCommand(SatelliteController controller) {
        this.controller = controller;
    }

    public void execute() {
        controller.captureData();
    }
}
