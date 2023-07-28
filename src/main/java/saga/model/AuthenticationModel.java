package saga.model;
import org.json.JSONObject;


public class AuthenticationModel {
    private String username;
    private String password;

    public AuthenticationModel() {
        // Constructor vacío requerido para deserialización JSON
    }

    public AuthenticationModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter para el atributo "username"
    public String getUsername() {
        return username;
    }

    // Setter para el atributo "username"
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter para el atributo "password"
    public String getPassword() {
        return password;
    }

    // Setter para el atributo "password"
    public void setPassword(String password) {
        this.password = password;
    }

    // Método personalizado para obtener el objeto JSON de la solicitud de autenticación
    public JSONObject toJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", this.username);
        jsonObject.put("password", this.password);
        return jsonObject;
    }
}
