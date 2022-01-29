package pl.uwm.rybinski.Lab13;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQue implements Comparable<PriorityQue> {

    private int priority;
    private String desc;

    public PriorityQue(int pri, String desc){
        if(desc == null)
            throw new NullPointerException();
        if(pri > 9 || pri < 0)
            throw new IllegalArgumentException();

        this.priority = pri;
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public int compareTo(PriorityQue o) {
        if(this.priority > o.priority)
            return -1;
        else if(this.priority < o.priority)
            return 1;

        return 0;
    }

    public static void main(String[] Args){
        boolean end = false;

        PriorityQueue<PriorityQue> queue = new PriorityQueue();

        while(!end){
            System.out.println("Lista zadań do wykonania:\n");
            for(PriorityQue i : queue){
                System.out.println("P:"+ i.getPriority() + " " + i.getDesc());
            }
            System.out.println("Wydaj polecenie\n");

            Scanner sc = new Scanner(System.in);

            String command = sc.next().toLowerCase();
            switch(command){
                case "dodaj":
                    try{
                        sc = new Scanner(System.in);
                        System.out.println("priorytet");
                        int pri = sc.nextInt();
                        System.out.println("opis");

                        sc = new Scanner(System.in);
                        String desc = sc.nextLine();

                        PriorityQue q = new PriorityQue(pri, desc);
                        queue.add(q);
                    }

                    catch (Exception e){
                        System.out.println("błąd");
                    }
                    break;

                case "następne":
                    System.out.println("wykonano: " + queue.poll().getDesc());
                    break;

                case "zakończ":
                    end = true;
                    break;

                default:
                    System.out.println("błąd wprowadzania");
                    break;
            }

        }
    }



}
