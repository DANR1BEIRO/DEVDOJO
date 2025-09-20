package academy.devdojo.maratonajava.javacore.Y_Collections.domain;

public class Android {
    private String serial;
    private String name;

    public Android(String serial, String name) {
        this.serial = serial;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Android android = (Android) obj;
        return serial != null && serial.equals(android.serial);
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
