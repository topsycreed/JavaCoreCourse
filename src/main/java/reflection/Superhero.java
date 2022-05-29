package reflection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Superhero {
    private String nickname;
    public String firstName;
    public String lastName;
    public int age;
    private String superpower;
}
