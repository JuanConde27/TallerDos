# Grocery Item API - README

## Descripción

Esta API permite manejar una lista de artículos de compra (Grocery Items) mediante varias operaciones CRUD (Crear, Leer, Actualizar, Eliminar). A continuación, se detallan las operaciones disponibles en la API, especificando cada verbo HTTP utilizado y su propósito.

## Endpoints

### 1. Obtener todos los elementos (GET)

- **URL:** `/groceryItems/getAll`
- **Verbo HTTP:** `GET`
- **Descripción:** Este método permite recuperar todos los elementos de la lista de compras.
- **Respuesta:** 
  - **Código 200:** Devuelve una lista de todos los artículos en formato JSON.
  
### 2. Insertar un nuevo elemento (POST)

- **URL:** `/groceryItems/insert`
- **Verbo HTTP:** `POST`
- **Descripción:** Este método permite agregar un nuevo artículo a la lista de compras.
- **Parámetros:**
  - **Request Body:** Un objeto JSON que representa el artículo a insertar.
- **Respuesta:**
  - **Código 201:** Confirma que el artículo fue insertado exitosamente.

### 3. Actualizar un elemento existente (PUT)

- **URL:** `/groceryItems/update`
- **Verbo HTTP:** `PUT`
- **Descripción:** Este método permite actualizar un artículo existente en la lista de compras.
- **Parámetros:**
  - **Request Header:** `id` - El ID del artículo a actualizar.
  - **Request Body:** Un objeto JSON con los datos actualizados del artículo.
- **Respuesta:**
  - **Código 200:** Confirma que el artículo fue actualizado exitosamente.

### 4. Eliminar un elemento (DELETE)

- **URL:** `/groceryItems/delete`
- **Verbo HTTP:** `DELETE`
- **Descripción:** Este método permite eliminar un artículo de la lista de compras.
- **Parámetros:**
  - **Request Header:** `id` - El ID del artículo a eliminar.
- **Respuesta:**
  - **Código 200:** Confirma que el artículo fue eliminado exitosamente.

### 5. Actualizar datos específicos de un elemento (PATCH)

- **URL:** `/groceryItems/updateData`
- **Verbo HTTP:** `PATCH`
- **Descripción:** Este método permite actualizar campos específicos de un artículo existente en la lista de compras.
- **Parámetros:**
  - **Request Header:** `id` - El ID del artículo a actualizar.
  - **Request Body:** Un objeto JSON con los campos específicos a actualizar.
- **Respuesta:**
  - **Código 200:** Confirma que los datos del artículo fueron actualizados exitosamente.

### 6. Manejar solicitudes HEAD (HEAD)

- **URL:** `/groceryItems/getAll`
- **Verbo HTTP:** `HEAD`
- **Descripción:** Este método devuelve los encabezados de la respuesta para la solicitud GET de todos los artículos, sin incluir el cuerpo de la respuesta.
- **Respuesta:**
  - **Código 200:** Devuelve solo los encabezados, como `Content-Type` y `Content-Length`.

## Anotaciones Utilizadas

### @RestController
`@RestController` es una anotación en Spring que se utiliza para definir una clase como un controlador RESTful. Esta anotación combina `@Controller` y `@ResponseBody`, lo que significa que los métodos de la clase devuelven directamente los datos en el cuerpo de la respuesta HTTP, en lugar de devolver una vista.

### @RequestMapping("item")
`@RequestMapping` se utiliza para mapear solicitudes web a clases o métodos específicos. En este caso, `"item"` especifica que todas las solicitudes a la clase o métodos anotados se deben hacer a través de la URL `/item`.

### @Autowired
`@Autowired` es una anotación de Spring que permite la inyección automática de dependencias. Esta anotación se coloca sobre un constructor, método o campo para indicar que Spring debe resolver e inyectar la instancia adecuada en el punto de inyección.

## Método en la Clase `GroceryItem`

### GroceryItem - Descripción del Método

En la clase `GroceryItem`, los métodos generalmente representan las operaciones que puedes realizar sobre un objeto de tipo `GroceryItem`, como obtener o establecer valores (getters y setters), o quizás métodos que calculen o transformen datos específicos del objeto.

### @Override

`@Override` es una anotación que se utiliza en Java para indicar que un método en una subclase está sobrescribiendo un método de una superclase. Esto ayuda a garantizar que el método en la subclase esté correctamente sobrescribiendo un método existente, evitando errores si el nombre o la firma del método no coinciden exactamente con el método de la superclase.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Configura tu entorno de desarrollo para Java y Spring Boot.
3. Compila y ejecuta el proyecto utilizando tu IDE preferido o desde la línea de comandos.

## Ejecución

Para ejecutar el proyecto, utiliza tu IDE de preferencia o la línea de comandos:

```bash
./mvnw spring-boot:run
