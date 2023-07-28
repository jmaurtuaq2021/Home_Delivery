package saga.model;
import org.json.JSONObject;


public class ProductModel {
    private String name;
    private String type;
    private double price;
    private int shipping;

    public ProductModel(String name, String type, double price, int shipping) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.shipping = shipping;
    }

    // Getters y setters según sea necesario

    // Método personalizado para obtener el objeto JSON de la solicitud de creación de producto
    public JSONObject toCreateProductJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", this.name);
        jsonObject.put("type", this.type);
        jsonObject.put("price", this.price);
        jsonObject.put("shipping", this.shipping);
        return jsonObject;
    }

    // Método personalizado para obtener el objeto JSON de la solicitud de actualización de producto
    public JSONObject toUpdateProductJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", this.name);
        jsonObject.put("type", this.type);
        jsonObject.put("price", this.price);
        return jsonObject;
    }
}

