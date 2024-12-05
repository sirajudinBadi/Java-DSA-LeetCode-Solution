//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101]; // For years 1950 to 2050

        // Increment for birth year and decrement for death year
        for (int[] log : logs) {
            population[log[0] - 1950]++;
            population[log[1] - 1950]--;
        }

        // Calculate cumulative population and track maximum
        int maxPopulation = 0, maxYear = 1950, currentPopulation = 0;
        for (int i = 0; i < 101; i++) {
            currentPopulation += population[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = 1950 + i;
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {
        MaximumPopulationYear solver = new MaximumPopulationYear();

        int[][] logs = {
            {1950, 1961},
            {1960, 1971},
            {1970, 1981}
        };

        int result = solver.maximumPopulation(logs);
        System.out.println("The year with the maximum population is: " + result);
    }
}
