package by.andrei.homework.finalTask.entity;

public abstract class Appliance {

    private String brand;
    private int price;

    public Appliance(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public abstract void switchOn();

    public abstract void switchOff();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Appliances " + "Brand: " + brand + ", Price: " + price;
    }
    
}
