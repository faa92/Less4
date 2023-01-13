public class Homework {
    public int sum(int i) {
        int sum = 0;
        for (int s = 0; s <= i; s++) {
            sum = sum + s;
            if (s == i) {

                break;


            }


        }

        return sum;
    }
}