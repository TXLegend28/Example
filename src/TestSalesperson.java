public class TestSalesperson {
    public static void main(String[] args) {
        Salesperson[] salesPeople = new Salesperson[10];

        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new Salesperson(9999, 0.0);
        }

        System.out.println("Salesperson Objects:");
        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i].display();
        }
    }
}