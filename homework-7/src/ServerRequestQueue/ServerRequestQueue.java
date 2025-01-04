package ServerRequestQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ServerRequestQueue {
    private Queue<Request> queue;

    public ServerRequestQueue() {
        queue = new PriorityQueue<>(Comparator.comparingInt(Request::getPriority));
    }

    public void addRequest(String client, int priority) {
        queue.add(new Request(client, priority));
    }

    public Request processNextRequest() {
        return queue.poll();
    }

    public void viewRequests() {
        if (queue.isEmpty()) {
            System.out.println("No requests in the queue.");
        } else {
            queue.forEach(System.out::println);
        }
    }

    public static class Request {
        private String client;
        private int priority;

        public Request(String client, int priority) {
            this.client = client;
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "Request{client='" + client + "', priority=" + priority + "}";
        }
    }
}
