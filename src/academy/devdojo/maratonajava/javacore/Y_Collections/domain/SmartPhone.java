package academy.devdojo.maratonajava.javacore.Y_Collections.domain;

public class SmartPhone {
    private String serial;
    private String marca;

    public SmartPhone(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
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

