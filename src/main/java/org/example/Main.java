package org.example;


import org.example.DependencyInersionPrinciple.MessageService;
import org.example.DependencyInersionPrinciple.Notification;
import org.example.DependencyInersionPrinciple.SMSService;
import org.example.DependencyInersionPrinciple.TikTokService;
import org.example.DependencyInersionPrinciple.EmailService;
import org.example.InterfaceSegregationPrinciple.Barista;
import org.example.InterfaceSegregationPrinciple.Mesero;
import org.example.InterfaceSegregationPrinciple.CoffeeMaker;
import org.example.InterfaceSegregationPrinciple.Cleaner;
import org.example.SingleResponsability.Product;
import org.example.SingleResponsability.ProductRepository;



public class Main {
    public static void main(String[] args) {
        // Ejemplo de Single Responsibility Principle (SRP)

        // Crear un producto
        Product product = new Product("Laptop", 799.99);

        // Crear instancia del repositorio
        ProductRepository repository = new ProductRepository();

        // Guardar el producto en la base de datos
        repository.saveToDatabase(product);

        // Cargar un producto desde la base de datos
        Product loadedProduct = repository.loadFromDatabase("Laptop");
        System.out.println("Producto cargado: " + loadedProduct.getName() + ", Precio: $" + loadedProduct.getPrice());

        // Ejemplo de Interface Segregation Principle (ISP)

        CoffeeMaker barista = new Barista();
        Cleaner mesero = new Mesero();

        barista.makeCoffee();  // El barista prepara el café
        mesero.cleanTable();   // El mesero limpia la mesa


        // Inyectamos una implementación concreta (SMSService) usando DIP
        MessageService smsService = new SMSService();
        Notification notification = new Notification(smsService);
        notification.send("¡Hola, este es un SMS!");

        // Cambiamos la implementación a EmailService
        MessageService emailService = new EmailService();
        notification = new Notification(emailService);
        notification.send("¡Hola, este es un correo electrónico!");

        // Cambiamos la implementación a TikTokService
        MessageService tiktokService = new TikTokService();
        notification = new Notification(tiktokService);
        notification.send("¡Hola, este es un mensaje de TikTok!");
    }
}
