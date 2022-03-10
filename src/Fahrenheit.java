public class Fahrenheit implements Temperature {

    private final double value;

    public Fahrenheit(double value) {
        this.value = value;
    }

    public Temperature convertToCel() {
        return new Celsius((value - 32) * 5 / 9d);
    }

    public Temperature convertToKel() {
        return new Kelvin((value + 459.67) * 5 / 9f);
    }

    @Override
    public Temperature convert(int resType) {
        switch (resType) {
            case 1 -> {
                return convertToCel();
            }
            case 2 -> {
                return this;
            }
            default -> {
                return convertToKel();
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%.2f", value) + " °F";
    }

}
