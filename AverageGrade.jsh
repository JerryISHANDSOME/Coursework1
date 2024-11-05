public class average_grades {
        public static void main(String[] args) {
                int[][] grades = {{51, 83, 28}, {0, 38, 95}};
                int[] weights = {30, 40, 30};
                int[] average_grades = average_grades(grades, weights);
                
                for (int avg : average_grades) {
                        System.out.println(avg);
                }
        }
    
        public static int[] average_grades(int grades[][], int weights[]) {
                int numStudents = grades.length;
                int[] results = new int[numStudents];
                
                for (int i = 0; i < numStudents; i++) {
                        int totalWeightedGrade = 0;
                        for (int j = 0; j < weights.length; j++) {
                                totalWeightedGrade += grades[i][j] * weights[j];
                        }
                        results[i] = totalWeightedGrade / 100; 
                }
                
                return results;
        }
}