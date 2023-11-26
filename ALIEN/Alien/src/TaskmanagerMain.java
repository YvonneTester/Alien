public class TaskmanagerMain {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Creating tasks
        Task task1 = new Task(1, "Complete homework");
        Task task2 = new Task(2, "Read a book");

        // Adding tasks to the task manager
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        // Displaying tasks
        System.out.println("Tasks:");
        taskManager.displayTasks();
    }
}