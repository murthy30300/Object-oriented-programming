package factory;

interface Vehicle {
void ride();
}

//Car class implementing the Vehicle interface
class Car implements Vehicle {
@Override
public void ride() {
    System.out.println("Riding a car");
}
}

//Bike class implementing the Vehicle interface
class Bike implements Vehicle {
@Override
public void ride() {
    System.out.println("Riding a bike");
}
}

//Scooter class implementing the Vehicle interface
class Scooter implements Vehicle {
@Override
public void ride() {
    System.out.println("Riding a scooter");
}
}

//VehicleFactory interface
interface VehicleFactory {
Vehicle createVehicle();
}

//CarFactory implementing the VehicleFactory interface
class CarFactory implements VehicleFactory {
@Override
public Vehicle createVehicle() {
    return new Car();
}
}

//BikeFactory implementing the VehicleFactory interface
class BikeFactory implements VehicleFactory {
@Override
public Vehicle createVehicle() {
    return new Bike();
}
}

//ScooterFactory implementing the VehicleFactory interface
class ScooterFactory implements VehicleFactory {
@Override
public Vehicle createVehicle() {
    return new Scooter();
}
}

//Payment interface
interface Payment {
void pay();
}

//CardPayment class implementing the Payment interface
class CardPayment implements Payment {
@Override
public void pay() {
    System.out.println("Paying with a card");
}
}

//CashPayment class implementing the Payment interface
class CashPayment implements Payment {
@Override
public void pay() {
    System.out.println("Paying with cash");
}
}

//PaymentFactory interface
interface PaymentFactory {
Payment createPayment();
}

//CardPaymentFactory implementing the PaymentFactory interface
class CardPaymentFactory implements PaymentFactory {
@Override
public Payment createPayment() {
    return new CardPayment();
}
}

//CashPaymentFactory implementing the PaymentFactory interface
class CashPaymentFactory implements PaymentFactory {
@Override
public Payment createPayment() {
    return new CashPayment();
}
}

//UserAuthentication class implementing the Singleton pattern
class UserAuthentication {
private static UserAuthentication instance;

private UserAuthentication() {
    // Private constructor to prevent instantiation
}

public static synchronized UserAuthentication getInstance() {
    if (instance == null) {
        instance = new UserAuthentication();
    }
    return instance;
}

public void authenticateUser() {
    System.out.println("User authenticated successfully");
}
}

//Main class
public class rideee{
public static void main(String[] args) {
    // Create a car using the CarFactory
    VehicleFactory carFactory = new CarFactory();
    Vehicle car = carFactory.createVehicle();
    car.ride();

    // Create a cash payment using the CashPaymentFactory
    PaymentFactory cashPaymentFactory = new CashPaymentFactory();
    Payment cashPayment = cashPaymentFactory.createPayment();
    cashPayment.pay();

    // Authenticate a user using the UserAuthentication singleton
    UserAuthentication userAuth = UserAuthentication.getInstance();
    userAuth.authenticateUser();
}
}

