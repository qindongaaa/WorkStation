package tech.wetech.admin.model.dto;
import lombok.Data;

@Data
public class RegisterDTO {
    private String username;
    private String password;
    private String email;
    private String mobile;

}
