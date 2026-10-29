package view;

import domain.Connection;
import domain.Ladder;
import domain.Line;
import java.util.List;

public class OutputView {
    public static void printLadder(Ladder ladder) {
        System.out.println("실행결과\n");
        List<Line> lines = ladder.getLines();
        for (Line line : lines) {
            printLine(line);
        }
    }

    private static void printLine(Line line) {
        System.out.print("    |");
        for (Connection point : line.getPoints()) {
            printPoint(point);
        }
        System.out.println();
    }

    private static void printPoint(Connection point) {
        if (point.isConnected()) {
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
