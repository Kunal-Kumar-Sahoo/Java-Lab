import java.util.*;

class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of subjects: ");
        int totalSubjects = sc.nextInt();
        System.out.print("Enter maximum marks of the subjects: ");
        int maxMarks = sc.nextInt();
        float perc = 0.0f;
        for(int i=0; i<totalSubjects; i++) {
            System.out.print("Enter marks scored in subject " + (i+1) + ": ");
            perc += 100 * sc.nextFloat() / (totalSubjects*maxMarks);
        }

        System.out.println("Percentage: " + perc + "%");

        sc.close();
    }
}
