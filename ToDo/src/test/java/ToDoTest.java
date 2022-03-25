import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Программа для хранения списка дел")

public class ToDoTest {

    private ToDoMap toDoMap;

    @BeforeEach
    public void setUp() {
        toDoMap = new ToDoMap();
    }

    @Test
    @DisplayName("Передано пустая строка в номере задачи")
    void addEmptyKey() {
        toDoMap.add(null, "Купить молоко");
        Set<String> expected = Set.of("0 - Купить молоко");
        assertEquals(expected, toDoMap.addAll());
    }

    @Test
    @DisplayName("Передано пустая строка в тексте задачи")
    void addEmptyPhone() {
        toDoMap.add(null, "");
        assertEquals(Collections.emptySet(), toDoMap.addAll());
    }
}
