package controller;

import domain.ColumnCount;
import domain.Ladder;
import domain.LadderGame;
import domain.LadderGenerator;
import domain.Name;
import domain.Result;
import domain.RowCount;
import java.util.ArrayList;
import java.util.List;
import view.InputView;
import view.OutputView;

public class Controller {
    public void run() {
        List<Name> nameList = inputNameList(InputView.inputNames());
        List<Result> resultList = inputResultList(InputView.inputResults());

        ColumnCount column = new ColumnCount(nameList.size());
        RowCount row = new RowCount(InputView.inputRow());
        Ladder ladder = new LadderGenerator().generate(row, column);
        LadderGame ladderGame = new LadderGame(ladder);
        List<Integer> gameResult = ladderGame.getResult();
        OutputView.printLadder(ladder);
        OutputView.printResult(gameResult);
    }

    private List<Name> inputNameList(String value) {
        List<Name> nameList = new ArrayList<>();
        for (String name : value.split(",", -1)) {
            nameList.add(new Name(name));
        }
        return nameList;
    }

    private List<Result> inputResultList(String value) {
        List<Result> resultList = new ArrayList<>();
        for (String result : value.split(",", -1)) {
            resultList.add(new Result(result.trim()));
        }
        return resultList;
    }
}
