package Diziler_Pratikleri;

public class HarmonikOrt {

    public static void main(String[] args) {

        double harmonicMean = 0;
        double harmonicSeries = 0.0;
        double[] list = {1, 2, 3, 4, 5};
        for (double j : list) {
            if (j == 0) {
                continue;
            } else {
                harmonicSeries += (1 / j);
                harmonicMean = list.length / harmonicSeries;

            }
        }
        System.out.println("Harmonik Ortalama : " + harmonicMean);

    }

}
