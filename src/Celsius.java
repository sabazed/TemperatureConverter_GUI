public class Celsius implements Temperature {

    private final double value;

    public Celsius(double value) {
        this.value = value;
    }

    public Fahrenheit convertToFah() {
        return new Fahrenheit((value * 1.8) + 32);
    }

    public Kelvin convertToKel() {
        return new Kelvin(value +  273.15);
    }

    @Override
    public Temperature convert(int resType) {
        switch (resType) {
            case 1 -> {
                return this;
            }
            case 2 -> {
                return convertToFah();
            }
            default -> {
                return convertToKel();
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%.2f", value) + " °C";
    }
}
