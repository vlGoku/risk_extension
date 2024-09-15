package Controller;

import View.StartWindowView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StartWindowController {
    JFrame startWindowFrame;

    ArrayList<String> playerColor;
    Color playerOneColor;
    Color playerTwoColor;
    Color playerThreeColor;
    Color playerFourColor;
    String boardChoice;

    public void setPlayerOneColor(Color color) {
        playerOneColor = color;
    }
    public void setPlayerTwoColor(Color color) {playerTwoColor = color; }
    public void setPlayerThreeColor(Color color){playerThreeColor = color; } //setter player three color
    public void setPlayerFourColor(Color color){playerFourColor = color; } //setter player four color

    public void setBoardChoice(String choice) {
        boardChoice = choice;
    }
    public boolean boardChosen() {
        return boardChoice != null;
    }
    public boolean colorsSet() {
        return playerOneColor != null && playerTwoColor != null && playerThreeColor != null && playerFourColor != null; //extended to player three and four
    }

    public void createStartWindow() {
        startWindowFrame = new StartWindowView(this).drawStartWindowFrame();
    }

    public void startGame(String[] playerNames, Color[] playerColor) {
        BoardController board = new BoardController(boardChoice, playerNames, playerColor);
        board.createBoardView();

        startWindowFrame.dispose();
    }

    public static void main(String[] args) {
        StartWindowController startWindowController = new StartWindowController();
        startWindowController.createStartWindow();

    }

}
