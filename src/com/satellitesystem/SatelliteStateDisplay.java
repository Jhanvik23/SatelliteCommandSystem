package com.satellitesystem;

class SatelliteStateDisplay implements SatelliteMonitor {
    public void refresh(SatelliteController controller) {
        System.out.println("Updated Satellite State:");
        System.out.println(controller.getCurrentState());
    }
}
