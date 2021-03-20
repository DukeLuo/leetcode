import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] allCellsDistOrder(int r, int c, int r0, int c0) {
        return sort(getAllCells(r, c), r0, c0);
    }

    private int[][] getAllCells(int R, int C) {
        int[][] cells = new int[R*C][2];
        int k = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                cells[k][0] = i;
                cells[k][1] = j;
                k++;
            }
        }
        return cells;
    }

    private int[][] sort(int[][] cells, int r0, int c0) {
        class CellComparator implements Comparator<int[]> {
            public int compare(int[] c1, int[] c2) {
                int[] cell0 = {r0, c0};
                int c1Distance = getDistance(c1, cell0);
                int c2Distance = getDistance(c2, cell0);
                return c1Distance - c2Distance;
            }
        }
        Arrays.sort(cells, new CellComparator());
        return cells;
    }

    private int getDistance(int[] c1, int[] c2) {
        return Math.abs(c2[0] -c1[0]) + Math.abs(c2[1] -c1[1]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.allCellsDistOrder(2, 3, 1, 2)));
    }
}

