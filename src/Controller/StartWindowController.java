package Controller;

import View.StartWindowView;

import javax.swing.*;
import java.awt.*;

public class StartWindowController {
    JFrame startWindowFrame;

    Color playerOneColor;
    Color playerTwoColor;
    Color playerThreeColor;
    Color playerFourColor;
    String boardChoice;

    public void setPlayerOneColor(Color color) {
        playerOneColor = color;
    }
    public void setPlayerTwoColor(Color color) {playerTwoColor = color; }
    public void setPlayerThreeColor(Color color){playerThreeColor = color; }
    public void setPlayerFourColor(Color color){playerFourColor = color; }

    public void setBoardChoice(String choice) {
        boardChoice = choice;
    }
    public boolean boardChosen() {
        return boardChoice != null;
    }
    public boolean colorsSet() {
        return playerOneColor != null && playerTwoColor != null && playerThreeColor != null && playerFourColor != null;
    }

    public void createStartWindow() {
        startWindowFrame = new StartWindowView(this).drawStartWindowFrame();
    }

    public void startGame(String playerOneName, String playerTwoName, String playerThreeName, String playerFourName) {
        BoardController board = new BoardController(boardChoice, playerOneName, playerTwoName, playerThreeName, playerFourName, playerOneColor, playerTwoColor, playerThreeColor, playerFourColor);
        board.createBoardView();

        startWindowFrame.dispose();
    }

    public static void main(String[] args) {
        StartWindowController startWindowController = new StartWindowController();
        startWindowController.createStartWindow();

    }

}
