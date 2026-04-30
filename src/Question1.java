public class Question1 {

    public static void main(String[] args) {
        question1a();
        question1b();
        question1c();
    }

    // 1a)
    public static void question1a() {
        int[] counts = new int[10];

        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        System.out.println("Counts Array: ");
        for (int i = 0; i < counts.length; i++) {
            System.out.print(counts[i] + " ");
        }
        System.out.println("\n");
    }

    // 1b)
    public static void question1b() {
        int[] bonus = new int[15];

        // This Array End at 14 starting from 0
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] = i; // just to show change
        }
        // This one Shifts the array and makes it start at 1 and end at 15
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] = bonus[i] + 1;
        }

        System.out.println("Bonous Array: ");
        for (int i = 0; i < bonus.length; i++) {
            System.out.print(bonus[i] + " ");
        }
        System.out.println("\n");
    }

    // 1c)
    public static void question1c() {
        int[] bestScores = {95, 88, 76, 100, 89};

        System.out.println("Best Score Array: ");
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println(bestScores[i]);
        }
        System.out.println();
    }
}