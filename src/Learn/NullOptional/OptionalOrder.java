package Learn.NullOptional;

import java.util.Optional;

public class OptionalOrder {
    private long id;
    // private String description; // Это поле может быть пустым то изменяем
    private Optional<String> description = Optional.empty(); // То вместо null будет работать empty

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(String descriptionString) {
        this.description = Optional.ofNullable(descriptionString);
    }
}
