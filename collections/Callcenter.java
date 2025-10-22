package collections;

import java.util.*;

public class Callcenter {
    public static void main(String[] args) {

        Queue<Call> incomingCalls = new LinkedList<>();
        List<User> users = new ArrayList<>();
        Random random = new Random();

        // Generate 5 random users
        for (int i = 1; i <= 5; i++) {
            String username = "User" + i;
            users.add(new User(username, 0)); // totalCalls starts at 0
        }

        // Generate 20 random calls
        for (int i = 1; i <= 22; i++) {
            String callerName = "Caller" + i;
            int callTime = random.nextInt(10) + 1; // Call time between 1-10 minutes
            incomingCalls.add(new Call(callerName, callTime));
        }

        // assign
        int count = 0;

        while (!incomingCalls.isEmpty()){
            int index  = count % 5;
            incomingCalls.poll();
            User user = users.get(index);
            user.totalCalls = user.totalCalls + 1;
            users.set(index, user);
            count++;

        }

        for (User u: users){
            System.out.println(" user " + u.username + " = " + u.totalCalls);
        }


    }
}

class User{
    String username;
    int totalCalls;
    List<String> calledList;

    public User(String username, int totalCalls) {
        this.username = username;
        this.totalCalls = totalCalls;
    }
}


class Call{
    String callerName;
    int callTime;
    int callDuration;

    public Call(String callerName, int callTime) {
        this.callerName = callerName;
        this.callTime = callTime;
    }
}
