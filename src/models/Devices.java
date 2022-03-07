package models;

public class Devices {
    private String deviceName;
    private String deviceBrand;

    public Devices(String deviceName, String deviceBrand) {
        this.deviceName = deviceName;
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String toString() {
        return "Devices{" +
                "deviceName='" + deviceName + '\'' +
                ", deviceBrand='" + deviceBrand + '\'' +
                '}';
    }
}
