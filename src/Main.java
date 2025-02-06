//Daniel Shaw
//2.4.25
//Project01
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myTasks = new ArrayList<>();

        //User choice
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Please choose an option: \n(1)Add a task. \n(2)Remove a task. \n(3)Update a task. \n(4)List all tasks. \n(0)Exit.");
        String userChoice = input.nextLine();

        // Creates a loop
        while (!(userChoice.equals("0"))) {
            if (userChoice.equals("1"))
                addTask(myTasks);
            if(userChoice.equals("2"))
                removeTask(myTasks);
            if(userChoice.equals("3"))
                updateTask(myTasks);
            if (userChoice.equals("4"))
                viewTasks(myTasks);
            System.out.println("\nPlease choose an option: \n(1)Add a task. \n(2)Remove a task. \n(3)Update a task. \n(4)List all tasks. \n(0)Exit.");
            userChoice = input.nextLine();
        }
    }

    // Adding a users task
    static void addTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat task would you like to add?");
        String taskToAddToList = input.nextLine();
        a.add(taskToAddToList);
    }
    // Removing a users task
    static void removeTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat task would you like to remove? (List starts at 0.)");
        System.out.println(a);
        int taskToRemove = input.nextInt();
        a.remove(taskToRemove);

    }
    // Updating the users tasks
    static void updateTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat task would you like to update? (List starts at 0.)");
        System.out.println(a);
        int updateTask = input.nextInt();
        input.nextLine();
        System.out.println("What description would you like to write for this updated task?");
        String updatedTaskDesc = input.nextLine();
        a.set(updateTask, updatedTaskDesc);
        System.out.println("\nYour updated tasks...");
        System.out.println(a);
    }

    static void viewTasks(ArrayList<String> a){
        System.out.println("\nHere's a list of your tasks...");
        System.out.println(a);
    }
}