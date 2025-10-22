package collections;

import java.util.LinkedList;
import java.util.Queue;

public class TodoQueueExample {

    public static void main(String[] args) {

        //blackboard
        //assignment
        ToDo task1 = new ToDo("Drink water", "6", "7");
        ToDo task2 = new ToDo("Study", "8", "9");

        Queue<ToDo> myCalendar = new LinkedList<>();
        myCalendar.add(task1);
        myCalendar.add(task2);

        String time = "1";
        while( !time.equals("12")){

            if(time.equals("6")){
                System.out.println("drink water");
                //send notification
                //send email
            }
        }
    }
}

class ToDo{
    String taskName;
    String startDate;
    String endDate;

    public ToDo(String taskName, String startDate, String endDate) {
        this.taskName = taskName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
