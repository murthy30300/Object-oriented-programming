package adapter;


class TemperatureAdapter {
    private Temperature temperature;

    public TemperatureAdapter(Temperature temperature) {
        this.temperature = temperature;
    }

    public double getCelsius() {
        return temperature.getTemperature();
    }

    public double getFahrenheit() {
        return (getCelsius() * 9/5) + 32;
    }

    public void setCelsius(double celsius) {
        temperature.setTemperature(celsius);
    }

    public void setFahrenheit(double fahrenheit) {
        setCelsius(fahrenheit - 32);
    }
}

interface Temperature {
    double getTemperature();
    void setTemperature(double temperature);
}

class Celsius implements Temperature {
    private double temperature;

    public Celsius(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

class Fahrenheit implements Temperature {
    private double temperature;

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Celsius(20);
        TemperatureAdapter adapter = new TemperatureAdapter(temperature);
        System.out.println("Celsius: " + adapter.getCelsius());
        System.out.println("Fahrenheit: " + adapter.getFahrenheit());
        adapter.setFahrenheit(80);
        System.out.println("Celsius: " + adapter.getCelsius());
        System.out.println("Fahrenheit: " + adapter.getFahrenheit());
    }
}
