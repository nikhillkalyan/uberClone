package uber.uber.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import uber.uber.entities.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private Set<Role> roles;
}
