package algorithms;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

	class Task {
	    int deadline;
	    int timeRequired;

	    Task(int deadline, int timeRequired) {
	        this.deadline = deadline;
	        this.timeRequired = timeRequired;
	    }
	}

	public class TaskScheduling {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of tasks: ");
	        int numTasks = scanner.nextInt();

	        Task[] tasks = new Task[numTasks];
	        for (int i = 0; i < numTasks; i++) {
	            System.out.println("Enter details for task " + (i + 1) + ":");
	            System.out.print("Deadline: ");
	            int deadline = scanner.nextInt();
	            System.out.print("Time Required: ");
	            int timeRequired = scanner.nextInt();

	            tasks[i] = new Task(deadline, timeRequired);
	        }
	        Arrays.sort(tasks, Comparator.comparingInt(task -> task.deadline));
	        System.out.println("Maximum overshoot for each task:");

	        int currentTime = 0;
	        for (Task task : tasks) {
	            currentTime += task.timeRequired;
	            int overshoot = Math.max(0, currentTime - task.deadline);
	            System.out.println(overshoot);
	        }
	    }
	}

