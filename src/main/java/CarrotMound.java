public class CarrotMound {
    public static void main(String[] args) {
        int[] clearing = {1, 2, 3, 4, 5};
        int maxLoad = 5;
        int numWalkers = 10;
        int totalWeight = 0;
        int[] remainingCarrots = new int[clearing.length];

        System.arraycopy(clearing, 0, remainingCarrots, 0, clearing.length);

        for (int walkers = 1; walkers <= numWalkers; walkers++) {
            if (walkers > 1) {
                totalWeight = 0;
            }

            if (totalWeight < maxLoad) {
                int maxIndex = findMaxIndex(remainingCarrots);

                if (remainingCarrots[maxIndex] > 0) {
                    int takenCarrot = Math.min(maxLoad - totalWeight, remainingCarrots[maxIndex]);
                    totalWeight += takenCarrot;
                    remainingCarrots[maxIndex] -= takenCarrot;
                    System.out.println("Ходок " + walkers + ": Взято " + takenCarrot + " кг с полянки " + (maxIndex + 1));

                } else {
                    System.out.println("Ходок " + walkers + ": Проход без моркови");
                }
            } else {
                System.out.println("Ходок " + walkers + ": Проход без моркови");
            }
        }
        System.out.println("Общий вес собранной моркови: " + totalWeight + " кг");
    }

    private static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
