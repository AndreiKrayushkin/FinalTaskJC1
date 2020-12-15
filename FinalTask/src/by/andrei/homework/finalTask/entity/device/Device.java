package by.andrei.homework.finalTask.entity.device;

import by.andrei.homework.finalTask.entity.Appliance;

public abstract class Device extends Appliance {

    private int powerConsumption;

    public Device(String brand, int price, int powerConsumption) {
        super(brand, price);
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + powerConsumption;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Device " + "Power Consumption: " + powerConsumption;
    }
}
