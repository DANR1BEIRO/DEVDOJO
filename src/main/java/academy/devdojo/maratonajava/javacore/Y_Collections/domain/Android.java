package academy.devdojo.maratonajava.javacore.Y_Collections.domain;

public class Android {
    private String serial;
    private String name;

    public Android(String serial, String name) {
        this.serial = serial;
        this.name = name;
    }

    /**
     * Características intrínsecas ao equals:
     * Reflexivo: x.equals(y) precisa retornar true para tudo que for diferente de null.
     * Simetria: Para x e y diferentes de null, se x.equals(y) == true, logo, y.equals(x) == true.
     * Transitividade: Para x, y, e z diferentes de null, se x.equal(y) == true e x.equals(z) == true,
     * logo y.equals(z) == true.
     * Consistência: x.equals(x) sempre retorna true se x for diferente de null.
     * Para x diferente de null, x.equals(null) sempre retornará false.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Android android = (Android) obj;
        return serial != null && serial.equals(android.serial);
    }

    /**
     * Características intrínsecas ao hashCode:
     * Se x.equals(y) == true, y.hashCode() == x.hashCode().
     * y.hashCode() == x.hashCode() não significa que y.equals(x) precisa ser true.
     * Se y.hashCode() != x.hashCode(), então x.equal(y) sempre será false.
     *
     */
    @Override
    public int hashCode() {
        return this.serial == null ? 0 : this.serial.hashCode();
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
