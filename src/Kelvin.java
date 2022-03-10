public class Kelvin implements Temperature {

    private final double value;

    public Kelvin(double value) {
        this.value = value;
    }

    public Temperature convertToCel() {
        return new Celsius(value -  273.15);
    }

    public Temperature convertToFah() {
        return new Fahrenheit(value * 1.8 - 459.67);
    }

    @Override
    public Temperature convert(int resType) {
        switch (resType) {
            case 1 -> {
                return convertToCel();
            }
            case 2 -> {
                return convertToFah();
            }
            default -> {
                return this;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%.2f", value) + " K";
    }

}
