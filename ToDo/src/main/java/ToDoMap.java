import java.util.*;

public class ToDoMap {
    String error = "Ошибка!";

    Map<Integer, String> toDoMap = new TreeMap<>() {};

    public void add(Integer key, String value) {
        if (key == null) {
            key = toDoMap.size();
        }
        if (value.equalsIgnoreCase("")) {
            System.out.println(error + "\nПередано пустое значение!");
        } else {
            toDoMap.put(key, value);
        }
    }

    public Set<String> addAll() {
        Set<String> newToDo = new TreeSet<>();
        if (toDoMap.isEmpty()) {
            System.out.println("Передан пустой список");

        } else {
            for (Map.Entry<? extends Integer, ? extends String> pair : toDoMap.entrySet()) {
                String value = pair.getValue();
                Integer key = pair.getKey();
                newToDo.add(key + " - " + value);
            }
        }
        return newToDo;
    }

    public void remove(Integer key) {
        if (toDoMap.isEmpty()) {
            System.out.println(error + "\nСписок дел пуст!");
        } else if (toDoMap.containsKey(key)) {
            for (Map.Entry<Integer, String> pair : toDoMap.entrySet()) {
                Integer thisKey = pair.getKey();
                String thisValue = pair.getValue();
                if (Objects.equals(thisKey, key)) {
                    toDoMap.remove(key);
                }
            }
        }
    }

    public void clearAll() {
        toDoMap.clear();
    }

    public String searchByKey(Integer key) {
        String valuesToDo = "";
        if (toDoMap.isEmpty()) {
            System.out.println(error + "\nСписок дел пуст!");
        } else if (toDoMap.containsKey(key)) {
            for (Map.Entry<Integer, String> pair : toDoMap.entrySet()) {
                Integer thisKey = pair.getKey();
                String thisValue = pair.getValue();
                if (Objects.equals(thisKey, key)) {
                    System.out.println("Найдено значение:\n" + thisKey + " - " + thisValue);
                    valuesToDo = thisKey + " - " + thisValue;
                } else return error + "\nЗначение не найдно";
            }
        }
        return valuesToDo;
    }

    public String searchByValue(String value) {
        String valuesToDo = "";
        if (toDoMap.isEmpty()) {
            System.out.println(error + "\nСписок дел пуст!");
        } else if (toDoMap.containsValue(value)) {
            for (Map.Entry<Integer, String> pair : toDoMap.entrySet()) {
                Integer thisKey = pair.getKey();
                String thisValue = pair.getValue();
                if (Objects.equals(thisValue, value)) {
                    System.out.println("Найдено значение:\n" + thisKey + " - " + thisValue);
                    valuesToDo = thisKey + " - " + thisValue;
                } else return error + "\nЗначение не найдно";
            }
        }
        return valuesToDo;
    }


}
