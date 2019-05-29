package tk.vvtf.suppliers.entity;

import java.util.Objects;

public class SupplierReport {

    private String name;

    private Float losses;

    public SupplierReport(String name, Float losses) {
        this.name = name;
        this.losses = losses;
    }

    public SupplierReport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getLosses() {
        return losses;
    }

    public void setLosses(Float losses) {
        this.losses = losses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplierReport)) return false;
        SupplierReport that = (SupplierReport) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getLosses(), that.getLosses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLosses());
    }

    @Override
    public String toString() {
        return "SupplierReport{" +
                "name='" + name + '\'' +
                ", losses=" + losses +
                '}';
    }
}
