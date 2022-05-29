package lombok;

/*
Generates getters for all fields, a useful toString method, and hashCode
and equals implementations that check all non-transient fields.
Will also generate setters for all non-final fields, as well as a constructor.

Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
*/
//@Data
//@AllArgsConstructor
public class Computer3 {
    final String title;
    final int ram;
    Boolean isGaming;

    public Computer3(String title, int ram) {
        this.title = title;
        this.ram = ram;
    }

    public Computer3(String title, int ram, Boolean isGaming) {
        this.title = title;
        this.ram = ram;
        this.isGaming = isGaming;
    }
}
