package org.example.SingleResponsability;

public class ProductRepository {

    // Método que guarda la información del producto en la base de datos
    public void saveToDatabase(Product product) {
        // Simulación de guardar el producto en la base de datos
        System.out.println("Guardando producto en la base de datos: " + product.getName() + " con precio: $" + product.getPrice());
    }

    // Método que carga la información del producto desde la base de datos
    public Product loadFromDatabase(String name) {
        // Simulación de cargar el producto desde la base de datos
        System.out.println("Cargando producto desde la base de datos con nombre: " + name);
        // Retornar un producto ficticio para este ejemplo
        return new Product(name, 19.99);
    }
}
