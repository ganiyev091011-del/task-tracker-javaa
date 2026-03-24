package Task_Tracker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type " + "\"" + "Start " + "\"" + " here to activate the program: ");
        String command = "";
        int indexCommand = -1;
        int numberOfTasks = -7;
        command = sc.next();
        String finishedTasks = "";
        String inProcessTasks = "";


        String message = """
                PLease, enter the command:\s
                 1. Addition:\s
                 2. Change the task:\s
                 3. Delete the task: \

                 4. Marking as done:\s
                 5. Marking as In Process:\s
                 6. All tasks:\s
                 7. Finished Tasks: \
                
                 8. Unfinished Tasks:\s
                 9. In Process Tasks:\s
                 0. Stop""";

        String changeTasks = "Which task you wanna change: 1, 2, 3, 4 or 5? ";
        String removeTasks = "Which task you wanna remove: 1, 2, 3, 4 or 5? ";
        String markAsDone = "Which task you have Finished: 1, 2, 3, 4 or 5? ";
        String markAsInProcess = "Which task you are Doing: 1, 2, 3, 4 or 5? ";


        System.out.println(message);

        ArrayList<String> taskList = new ArrayList<>();

        while (indexCommand != 0) {

            // Adding new tasks:

            indexCommand = sc.nextInt();
            if (indexCommand == 1) {

                sc.nextLine();
                System.out.print("Task-1: ");
                taskList.add(0, (sc.nextLine()));

                System.out.print("Task-2: ");
                taskList.add(1, (sc.nextLine()));

                System.out.print("Task-3: ");
                taskList.add(2, (sc.nextLine()));

                System.out.print("Task-4: ");
                taskList.add(3, (sc.nextLine()));

                System.out.print("Task-5: ");
                taskList.add(4, (sc.nextLine()));

                System.out.println("Done...");

                System.out.println();
                System.out.println(message);


                // Changing the tasks:
            } else if (indexCommand == 2) {
                System.out.println(changeTasks);
                numberOfTasks = sc.nextInt();

                switch (numberOfTasks) {
                    case 1:
                        taskList.set(0, sc.nextLine());
                        System.out.print("Task-1: ");
                        taskList.add(0, (sc.nextLine()));
                        break;

                    case 2:
                        taskList.set(1, sc.nextLine());
                        System.out.print("Task-2: ");
                        taskList.add(1, (sc.nextLine()));
                        break;

                    case 3:
                        taskList.set(2, sc.nextLine());
                        System.out.print("Task-3: ");
                        taskList.add(2, (sc.nextLine()));
                        break;

                    case 4:
                        taskList.set(3, sc.nextLine());
                        System.out.print("Task-4: ");
                        taskList.add(3, (sc.nextLine()));
                        break;

                    case 5:
                        taskList.set(4, sc.nextLine());
                        System.out.print("Task-5: ");
                        taskList.add(4, (sc.nextLine()));
                        break;

                }
                System.out.println("Done...");

                System.out.println(taskList);
                System.out.println();
                System.out.println(message);


                // Removing the Tasks
            } else if (indexCommand == 3) {
                System.out.println(removeTasks);
                numberOfTasks = sc.nextInt();

                switch (numberOfTasks) {

                    case 1:
                        System.out.println("Task-1: ");
                        taskList.remove(0);
                        break;

                    case 2:
                        System.out.println("Task-2");
                        taskList.remove(1);
                        break;

                    case 3:
                        System.out.println("Task-3");
                        taskList.remove(2);
                        break;

                    case 4:
                        System.out.println("Task-4");
                        taskList.remove(3);
                        break;

                    case 5:
                        System.out.println("Task-5");
                        taskList.remove(4);
                        break;


                }
                System.out.println("Done...");

                System.out.println(taskList);
                System.out.println();
                System.out.println(message);


                // Marking tasks as Done
            } else if (indexCommand == 4) {
                System.out.println(markAsDone);
                numberOfTasks = sc.nextInt();

                switch (numberOfTasks) {

                    case 1:
                        String finished1 = taskList.get(0);
                        System.out.println("Task-1: " + "\"" + taskList.get(0) + "\"" + " [finished]" );
                        taskList.remove(0);
                        finishedTasks = finished1;
                        break;

                    case 2:
                        String finished2 = taskList.get(1);
                        System.out.println("Task-2: " + "\"" + taskList.get(1) + "\"" + " [finished]" );
                        taskList.remove(1);
                        finishedTasks = finished2;
                        break;

                    case 3:
                        String finished3 = taskList.get(2);
                        System.out.println("Task-3: " + "\"" + taskList.get(2) + "\"" + " [finished]" );
                        taskList.remove(2);
                        finishedTasks = finished3;
                        break;

                    case 4:
                        String finished4 = taskList.get(3);
                        System.out.println("Task-4: " + "\"" + taskList.get(3) + "\"" + " [finished]" );
                        taskList.remove(3);
                        finishedTasks = finished4;
                        break;

                    case 5:
                        String finished5 = taskList.get(4);
                        System.out.println("Task-5: " + "\"" + taskList.get(4) + "\"" + " [finished]" );
                        taskList.remove(4);
                        finishedTasks = finished5;
                        break;

                }
                System.out.println(taskList);
                System.out.println();
                System.out.println(message);


                // Marking tasks as "In Process"
            } else if (indexCommand == 5) {
                System.out.println(markAsInProcess);
                numberOfTasks = sc.nextInt();

                switch (numberOfTasks) {

                    case 1:
                        inProcessTasks = taskList.get(0);
                        System.out.println("Task-1: " + "\"" + taskList.get(0) + "\"" + " [is in process...]" );
                        continue;

                    case 2:
                        inProcessTasks = taskList.get(1);
                        System.out.println("Task-2: " + "\"" + taskList.get(1) + "\"" + " [is in process...]" );
                        continue;

                    case 3:
                        inProcessTasks = taskList.get(2);
                        System.out.println("Task-3: " + "\"" + taskList.get(2) + "\"" + " [is in process...]" );
                        continue;

                    case 4:
                        inProcessTasks = taskList.get(3);
                        System.out.println("Task-4: " + "\"" + taskList.get(3) + "\"" + " [is in process...]" );
                        continue;

                    case 5:
                        inProcessTasks = taskList.get(4);
                        System.out.println("Task-5: " + "\"" + taskList.get(4) + "\"" + " [is in process...]" );
                        continue;


                }
//                System.out.println(taskList);
                System.out.println();
                System.out.println(message);


            } else if (indexCommand == 6) {
                System.out.println("All Tasks to do: ");
                System.out.println(taskList);

                System.out.println();
                System.out.println(message);


            } else if (indexCommand == 7) {
                System.out.println("Finished tasks: ");
                System.out.println("(" + finishedTasks + ")");


            } else if (indexCommand == 8) {
                indexCommand = 4;
                System.out.println("Unfinished tasks: ");
                System.out.println(finishedTasks);

            } else if (indexCommand == 9) {
                indexCommand = 5;
                System.out.println("Tasks in process: ");
                System.out.println(inProcessTasks);
            }
        }
    }
}