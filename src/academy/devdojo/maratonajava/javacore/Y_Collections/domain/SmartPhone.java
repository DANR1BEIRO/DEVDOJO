package academy.devdojo.maratonajava.javacore.Y_Collections.domain;

public class SmartPhone {
    private String serial;
    private String marca;

    public SmartPhone(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return serial != null && serial.equals(smartPhone.serial);
    }

    @Override
    public int hashCode() {
        return this.serial == null ? 0 : this.serial.hashCode();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

