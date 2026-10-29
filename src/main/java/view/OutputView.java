package view;

import domain.Ladder;
import domain.Line;
import java.util.List;

public class OutputView {
    public static void printLadder(Ladder ladder, int row, int column) {
        System.out.println("실행결과\n");
        List<Line> lines = ladder.getLines();
        for (int i = 0; i < row; i++) {
            printLine(lines.get(i));
        }
    }

    private static void printLine(Line line) {
        for (boolean point : line.getPoints()) {
            printPoint(point);
        }
        System.out.println();
    }

    private static void printPoint(boolean point) {
        if (point) {
            System.out.print("-----|");
            return;
        }
        System.out.print("     |");
    }

    public static void printResult(List<Integer> resultList) {
        System.out.println();
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(i + " -> " + resultList.get(i));
        }
    }
}
