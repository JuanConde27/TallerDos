package Taller2.Juan_Manuel_Conde.Repositories;

import Taller2.Juan_Manuel_Conde.Models.GroceryItemModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroceryItemRepository extends MongoRepository<GroceryItemModel, String> {

    // Método para encontrar items por nombre
    List<GroceryItemModel> findByName(String name);

    // Método para encontrar items por categoría
    List<GroceryItemModel> findByCategory(String category);

    // Método para encontrar items por cantidad
    List<GroceryItemModel> findByQuantity(int quantity);
}
