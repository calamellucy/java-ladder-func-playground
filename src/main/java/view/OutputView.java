package view;

import domain.Ladder;
import domain.Line;
import java.util.List;

public class OutputView {
    public static void printLadder(Ladder ladder, int row, int column) {
        System.out.println("실행결과\n");
        List<Line> lineList = ladder.getLines();
        for (int i = 0; i < row; i++) {
            System.out.print("     |");
            for (int j = 0; j < column - 1; j++) {
                if (lineList.get(i).getPoints().get(j)) {
                    System.out.print("-----|");
                    continue;
                }
                System.out.print("     |");
            }
            System.out.print("\n");
        }
    }
}
