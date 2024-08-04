package co1;

import java.util.*;


public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> sheets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] sheet = new int[4];
            for (int j = 0; j < 4; j++) {
                sheet[j] = scanner.nextInt();
            }
            sheets.add(sheet);
        }

        Set<int[]> coveredPoints = new HashSet<>();
        for (int[] sheet : sheets) {
            for (int x = sheet[0]; x < sheet[1]; x++) {
                for (int y = sheet[2]; y < sheet[3]; y++) {
                    coveredPoints.add(new int[]{x, y});
                }
            }
        }

        System.out.println(coveredPoints.size());
    }
}
