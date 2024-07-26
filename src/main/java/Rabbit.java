import java.util.Arrays;

public class Rabbit {
    public int maxCarrots(int[] fields, int maxLoad, int trips) {
        int totalCarrots = 0;
        int tripCount = 0;

        Arrays.sort(fields);

        for (int i = 0; i < fields.length / 2; i++) {
            int temp = fields[i];
            fields[i] = fields[fields.length - 1 - i];
            fields[fields.length - 1 - i] = temp;
        }

        for (int i = 0; i < fields.length; i++) {
            while (fields[i] > 0 && tripCount < trips) {
                if (fields[i] <= maxLoad) {
                    totalCarrots += fields[i];
                    fields[i] = 0;
                } else {
                    totalCarrots += maxLoad;
                    fields[i] -= maxLoad;
                }
                tripCount++;
            }
            if (tripCount >= trips) {
                break;
            }
        }

        return totalCarrots;
    }
}
