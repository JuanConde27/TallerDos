package Taller2.Juan_Manuel_Conde.Controllers;

import Taller2.Juan_Manuel_Conde.Models.GroceryItemModel;
import Taller2.Juan_Manuel_Conde.Services.GroseryItemService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groceryItems")
public class GroseryItemController {

    private final GroseryItemService groseryItemService;

    public GroseryItemController(GroseryItemService groseryItemService) {
        this.groseryItemService = groseryItemService;
    }

    // 1. Método para obtener todos los elementos (GET)
    @GetMapping("/getAll")
    public List<GroceryItemModel> getAll(){
        return groseryItemService.getAll();
    }

    // 2. Método para insertar un nuevo elemento (POST)
    @PostMapping("/insert")
    public String insert(@RequestBody GroceryItemModel groceryItem){
        return groseryItemService.insert(groceryItem);
    }

    // 3. Método para actualizar un elemento existente (PUT)
    @PutMapping("/update")
    public String update(@RequestHeader("id") String id, @RequestBody GroceryItemModel groceryItem){
        return groseryItemService.update(id, groceryItem);
    }

    // 4. Método para eliminar un elemento (DELETE) usando el ID de los Headers
    @DeleteMapping("/delete")
    public String deleteItem(@RequestHeader("id") String id) {
        return groseryItemService.delete(id);
    }

    // 5. Método para actualizar datos específicos de un elemento (PATCH) usando el ID de los Headers
    @PatchMapping("/updateData")
    public String updateData(@RequestHeader("id") String id, @RequestBody GroceryItemModel groceryItem) {
        return groseryItemService.updateData(id, groceryItem);
    }

    // 6. Método para manejar solicitudes HEAD
    @RequestMapping(value = "/getAll", method = RequestMethod.HEAD)
    public ResponseEntity<?> handleHeadRequest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }
}