package Taller2.Juan_Manuel_Conde.Services;

import Taller2.Juan_Manuel_Conde.Models.GroceryItemModel;
import Taller2.Juan_Manuel_Conde.Repositories.GroceryItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroseryItemService {

    private final GroceryItemRepository groceryItemRepository;

    public GroseryItemService(GroceryItemRepository groceryItemRepository) {
        this.groceryItemRepository = groceryItemRepository;
    }

    // Obtener todos los elementos
    public List<GroceryItemModel> getAll() {
        return groceryItemRepository.findAll();
    }

    // Insertar un nuevo elemento
    public String insert(GroceryItemModel groceryItemModel) {
        groceryItemRepository.save(groceryItemModel);
        return "---ITEM INSERTADO---\n" + groceryItemModel.toString();
    }

    public String update(String id, GroceryItemModel groceryItemModel) {
        Optional<GroceryItemModel> existingItem = groceryItemRepository.findById(id);
        if (existingItem.isPresent()) {
            GroceryItemModel itemToUpdate = existingItem.get();
            // Actualiza los campos necesarios
            itemToUpdate.setName(groceryItemModel.getName());
            itemToUpdate.setQuantity(groceryItemModel.getQuantity());
            itemToUpdate.setCategory(groceryItemModel.getCategory());
            groceryItemRepository.save(itemToUpdate); // Guarda el documento actualizado
            return "---ITEM ACTUALIZADO---\n" + itemToUpdate.toString();
        } else {
            return "---ITEM NO ENCONTRADO---";
        }
    }

    // Eliminar un elemento por ID
    public String delete(String id) {
        Optional<GroceryItemModel> existingItem = groceryItemRepository.findById(id);
        if (existingItem.isPresent()) {
            groceryItemRepository.deleteById(id);
            return "---ITEM ELIMINADO---";
        } else {
            return "---ITEM NO ENCONTRADO---";
        }
    }

    // Actualizar datos específicos de un elemento
    public String updateData(String id, GroceryItemModel groceryItemModel) {
        Optional<GroceryItemModel> existingItem = groceryItemRepository.findById(id);
        if (existingItem.isPresent()) {
            GroceryItemModel item = existingItem.get();
            if (groceryItemModel.getName() != null) {
                item.setName(groceryItemModel.getName());
            }
            if (groceryItemModel.getCategory() != null) {
                item.setCategory(groceryItemModel.getCategory());
            }
            groceryItemRepository.save(item);
            return "---ITEM ACTUALIZADO---\n" + item.toString();
        } else {
            return "---ITEM NO ENCONTRADO---";
        }
    }

    // Mensaje de opciones
    public String optionsUpdate() {
        return "OPTIONS: Insert a new grocery item, if the grocery item doesn't exist, it will create automatically.";
    }
}