package lombok;

/*
Generates getters for all fields, a useful toString method, and hashCode
and equals implementations that check all non-transient fields.
Will also generate setters for all non-final fields, as well as a constructor.

Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
*/
@Data
public class Computer {
    String title;
    int ram;
    Boolean isGaming;
}
