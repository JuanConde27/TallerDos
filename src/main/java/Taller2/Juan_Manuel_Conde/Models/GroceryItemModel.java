package Taller2.Juan_Manuel_Conde.Models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "groceryItems")
public class GroceryItemModel {

    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "quantity")
    private int quantity;

    @Field(name = "category")
    private String category;

}
