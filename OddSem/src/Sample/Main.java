package Sample;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static final int NINE_BY_NINE_SIZE = 9;
    private static final int TOP_LEFT_REGION_SIZE = 3;
    private static final int BOTTOM_RIGHT_REGION_SIZE = 6;

    public static List<String> findTaKCodes(String[] grid) {
        List<String> takCodes = new ArrayList<>();

        int n = grid.length;
        int m = grid[0].length();

        for (int i = 0; i <= n - NINE_BY_NINE_SIZE; i++) {
            for (int j = 0; j <= m - NINE_BY_NINE_SIZE; j++) {
                if (isValidTaKCode(grid, i, j)) {
                    StringBuilder takCode = new StringBuilder();
                    for (int k = i; k < i + NINE_BY_NINE_SIZE; k++) {
                        takCode.append(grid[k].substring(j, j + NINE_BY_NINE_SIZE));
                    }
                    takCodes.add(takCode.toString());
                }
            }
        }

        return takCodes;
    }

    private static boolean isValidTaKCode(String[] grid, int row, int col) {
        // Check the top-left region
        for (int i = row; i < row + TOP_LEFT_REGION_SIZE; i++) {
            for (int j = col; j < col + TOP_LEFT_REGION_SIZE; j++) {
                if (grid[i].charAt(j) == '.') {
                    return false;
                }
            }
        }

        // Check the bottom-right region
        for (int i = row + BOTTOM_RIGHT_REGION_SIZE; i < row + NINE_BY_NINE_SIZE; i++) {
            for (int j = col + BOTTOM_RIGHT_REGION_SIZE; j < col + NINE_BY_NINE_SIZE; j++) {
                if (grid[i].charAt(j) == '.') {
                    return false;
                }
            }
        }

        // Check the adjacent cells
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = row; i < row + NINE_BY_NINE_SIZE; i++) {
            for (int j = col; j < col + NINE_BY_NINE_SIZE; j++) {
                if ((i < row + TOP_LEFT_REGION_SIZE || i >= row + BOTTOM_RIGHT_REGION_SIZE)
                        && (j < col + TOP_LEFT_REGION_SIZE || j >= col + BOTTOM_RIGHT_REGION_SIZE)) {
                    for (int k = 0; k < dx.length; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length()) {
                            if (grid[nx].charAt(ny) == '#') {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (N): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns (M): ");
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the grid:");
        String[] grid = new String[n];
        for (int i = 0; i < n; i++) {
            grid[i] = scanner.nextLine();
        }

        List<String> takCodes = findTaKCodes(grid);
        for (String takCode : takCodes) {
            System.out.println(takCode);
        }

        scanner.close();
    }
}
