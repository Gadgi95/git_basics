import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {
        ToDoMap toDoMap = new ToDoMap();

        String menu = "Возможности списка задач: " +
                "\n1. Добавить задачу\n2.Посмотреть задачу\n3.Удалить задачу\n4.Просмотреть весь список задач";
        String action = "Введите номер указанный в меню действий";
        String toDoAdd = "Напишите задачу";
        String todoRemove = "Напишите номер задачи на удаление";



        System.out.println(menu + "\n" + action);

        String firstUserInput = UserInput.getLine();

        if(UserInput.getLine().equals("1") || UserInput.getLine().equalsIgnoreCase("Добавить задачу")){
            System.out.println(action);
            toDoMap.toDoMap.put(Integer.parseInt(UserInput.getLine()) , UserInput.getLine());
        }



    }

}
