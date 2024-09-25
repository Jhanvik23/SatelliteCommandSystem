package com.satellitesystem;

import java.util.ArrayList;
import java.util.List;

// Singleton class managing the satellite's state
class SatelliteController {
    private static SatelliteController instance;
    private SatelliteOrientation orientation;
    private boolean panelsActive;
    private int dataCollected;
    private List<SatelliteMonitor> monitors;

    private SatelliteController() {
        orientation = SatelliteOrientation.NORTH;
        panelsActive = false;
        dataCollected = 0;
        monitors = new ArrayList<>();
    }

    public static SatelliteController getInstance() {
        if (instance == null) {
            instance = new SatelliteController();
        }
        return instance;
    }

    public void attachMonitor(SatelliteMonitor monitor) {
        monitors.add(monitor);
    }

    public void detachMonitor(SatelliteMonitor monitor) {
        monitors.remove(monitor);
    }

    private void notifyMonitors() {
        for (SatelliteMonitor monitor : monitors) {
            monitor.refresh(this);
        }
    }

    public SatelliteOrientation getOrientation() {
        return orientation;
    }

    public boolean arePanelsActive() {
        return panelsActive;
    }

    public int getCollectedData() {
        return dataCollected;
    }

    public void adjustOrientation(SatelliteOrientation newOrientation) {
        orientation = newOrientation;
        notifyMonitors();
    }

    public void enableSolarPanels() throws SolarPanelActivationException {
        if (!panelsActive) {
            panelsActive = true;
            notifyMonitors();
        } else {
            throw new SolarPanelActivationException("Solar panels are already activated.");
        }
    }

    public void disableSolarPanels() {
        panelsActive = false;
        notifyMonitors();
    }

    public void captureData() {
        if (panelsActive) {
            dataCollected += 10;
            notifyMonitors();
        }
    }

    public String getCurrentState() {
        return "Orientation: " + orientation + "\nSolar Panels: " + (panelsActive ? "Active" : "Inactive") + "\nData Collected: " + dataCollected;
    }
}

