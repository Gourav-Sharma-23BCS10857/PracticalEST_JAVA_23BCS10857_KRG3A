import java.util.*;

public class studentsorters {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            students.add(sc.nextLine());
        }

        Collections.sort(students);

        System.out.println("Sorted Student Names:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}

