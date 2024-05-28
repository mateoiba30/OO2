package ar.edu.unlp.info.oo2.rw.model;

public class SolarPanelWithBattery extends EnergySource
{
    public void consumeBattery(Robot r) {
        System.out.println("Robot " + r.getName() + " using solar panel with battery");
    }
 
}