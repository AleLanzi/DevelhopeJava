import java.util.Objects;

public class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return batterymAh == smartphone.batterymAh &&
                brandName.equals(smartphone.brandName) &&
                modelName.equals(smartphone.modelName) &&
                producerPrice.equals(smartphone.producerPrice) &&
                retailPrice.equals(smartphone.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) retailPrice.clone();
        return clonedSmartphone;
    }
}
