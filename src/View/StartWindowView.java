package View;

import Controller.StartWindowController;
import Config.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindowView implements ActionListener {
    public static final int HEADLINE_HEIGHT = 50;
    public static final int NAME_HEIGHT = 150;
    public static final int BOARD_CHOICE_HEIGHT = 150;
    public static final int PLAYER_NAME_WIDTH = 250;

    JFrame frame;

    //added colors for player three and four
    JTextField playerOneName;
    JTextField playerTwoName;
    JTextField playerThreeName;
    JTextField playerFourName;
    JButton playerOneColorButton1;
    JButton playerOneColorButton2;
    JButton playerOneColorButton3;
    JButton playerTwoColorButton1;
    JButton playerTwoColorButton2;
    JButton playerTwoColorButton3;
    JButton playerThreeColorButton1;
    JButton playerThreeColorButton2;
    JButton playerThreeColorButton3;
    JButton playerFourColorButton1;
    JButton playerFourColorButton2;
    JButton playerFourColorButton3;

    JButton board1;
    JButton board2;
    JButton board3;
    JButton board4;
    JButton board5;

    GridBagLayout startWindowLayout = new GridBagLayout();
    GridBagConstraints startWindowConstraints = new GridBagConstraints();
    JPanel startWindowPanel = new JPanel(startWindowLayout);

    private final StartWindowController controller;

    public StartWindowView(StartWindowController controller) {
        this.controller = controller;
    }

    public JFrame drawStartWindowFrame() {
        frame = new JFrame("Risk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setResizable(false);

        //Extended to two rows
        startWindowLayout.rowHeights = new int[] { HEADLINE_HEIGHT, NAME_HEIGHT, NAME_HEIGHT, BOARD_CHOICE_HEIGHT};
        startWindowLayout.columnWidths = new int[] { PLAYER_NAME_WIDTH, PLAYER_NAME_WIDTH};

        JLabel headline = new JLabel("Risk", JLabel.CENTER);
        headline.setFont(new Font(headline.getFont().getName(), Font.PLAIN, 20));


        //Extended to four players
        JPanel playerOnePanel = new JPanel(new GridLayout(4, 1));
        playerOnePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel playerOneHeadline = new JLabel("Player One Name: ", JLabel.CENTER);
        playerOneName = new JTextField();
        JLabel playerOneColorHeadline = new JLabel("Choose Player One Color: ", JLabel.CENTER);
        JPanel playerOneColorButtonPanel = new JPanel(new GridLayout(1, 3));
        playerOneColorButtonPanel.setBorder(BorderFactory.createEmptyBorder(0,10,2,10));
        playerOneColorButton1 = createButton("", new Color(61, 194, 87), "playerOneColorButton1");
        playerOneColorButton2 = createButton("", new Color(60, 101, 195), "playerOneColorButton2");
        playerOneColorButton3 = createButton("", new Color(197, 60, 58), "playerOneColorButton3");
        playerOneColorButtonPanel.add(playerOneColorButton1);
        playerOneColorButtonPanel.add(playerOneColorButton2);
        playerOneColorButtonPanel.add(playerOneColorButton3);
        playerOnePanel.add(playerOneHeadline);
        playerOnePanel.add(playerOneName);
        playerOnePanel.add(playerOneColorHeadline);
        playerOnePanel.add(playerOneColorButtonPanel);

        JPanel playerTwoPanel = new JPanel(new GridLayout(4, 1));
        playerTwoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel playerTwoHeadline = new JLabel("Player Two Name: ", JLabel.CENTER);
        playerTwoName = new JTextField();
        JLabel playerTwoColorHeadline = new JLabel("Choose Player Two Color: ", JLabel.CENTER);
        JPanel playerTwoColorButtonPanel = new JPanel(new GridLayout(1, 3));
        playerTwoColorButtonPanel.setBorder(BorderFactory.createEmptyBorder(0,10,2,10));
        playerTwoColorButton1 = createButton("", new Color(194, 61, 168), "playerTwoColorButton1");
        playerTwoColorButton2 = createButton("", new Color(195, 154, 60), "playerTwoColorButton2");
        playerTwoColorButton3 = createButton("", new Color(58, 195, 197), "playerTwoColorButton3");
        playerTwoColorButtonPanel.add(playerTwoColorButton1);
        playerTwoColorButtonPanel.add(playerTwoColorButton2);
        playerTwoColorButtonPanel.add(playerTwoColorButton3);
        playerTwoPanel.add(playerTwoHeadline);
        playerTwoPanel.add(playerTwoName);
        playerTwoPanel.add(playerTwoColorHeadline);
        playerTwoPanel.add(playerTwoColorButtonPanel);

        JPanel playerThreePanel = new JPanel(new GridLayout(4, 1));
        playerThreePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel playerThreeHeadline = new JLabel("Player Three Name: ", JLabel.CENTER);
        playerThreeName = new JTextField();
        JLabel playerThreeColorHeadline = new JLabel("Choose Player Three Color: ", JLabel.CENTER);
        JPanel playerThreeColorButtonPanel = new JPanel(new GridLayout(1, 3));
        playerThreeColorButtonPanel.setBorder(BorderFactory.createEmptyBorder(0,10,2,10));
        playerThreeColorButton1 = createButton("", new Color(230, 54, 102), "playerThreeColorButton1");
        playerThreeColorButton2 = createButton("", new Color(23, 23, 107), "playerThreeColorButton2");
        playerThreeColorButton3 = createButton("", new Color(100, 200, 66), "playerThreeColorButton3");
        playerThreeColorButtonPanel.add(playerThreeColorButton1);
        playerThreeColorButtonPanel.add(playerThreeColorButton2);
        playerThreeColorButtonPanel.add(playerThreeColorButton3);
        playerThreePanel.add(playerThreeHeadline);
        playerThreePanel.add(playerThreeName);
        playerThreePanel.add(playerThreeColorHeadline);
        playerThreePanel.add(playerThreeColorButtonPanel);

        JPanel playerFourPanel = new JPanel(new GridLayout(4, 1));
        playerFourPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel playerFourHeadline = new JLabel("Player Four Name: ", JLabel.CENTER);
        playerFourName = new JTextField();
        JLabel playerFourColorHeadline = new JLabel("Choose Player Two Color: ", JLabel.CENTER);
        JPanel playerFourColorButtonPanel = new JPanel(new GridLayout(1, 3));
        playerFourColorButtonPanel.setBorder(BorderFactory.createEmptyBorder(0,10,2,10));
        playerFourColorButton1 = createButton("", new Color(33, 61, 72), "playerFourColorButton1");
        playerFourColorButton2 = createButton("", new Color(190, 178, 69), "playerFourColorButton2");
        playerFourColorButton3 = createButton("", new Color(12, 22, 166), "playerFourColorButton3");
        playerFourColorButtonPanel.add(playerFourColorButton1);
        playerFourColorButtonPanel.add(playerFourColorButton2);
        playerFourColorButtonPanel.add(playerFourColorButton3);
        playerFourPanel.add(playerFourHeadline);
        playerFourPanel.add(playerFourName);
        playerFourPanel.add(playerFourColorHeadline);
        playerFourPanel.add(playerFourColorButtonPanel);


        JPanel boardChoicePanel = new JPanel(new GridLayout(3, 1));
        JLabel choice = new JLabel("Choose a game board:", JLabel.CENTER);
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0,20,10,20));
        board1 = createButton("Board 1", null, "board1");
        board2 = createButton("Board 2", null, "board2");
        board3 = createButton("Board 3", null, "board3");
        board4 = createButton("Board 4", null, "board4");
        board5 = createButton("Board 5", null, "board5");


        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(this);
        startButton.setActionCommand("startButton");
        buttonPanel.add(board1);
        buttonPanel.add(board2);
        buttonPanel.add(board3);
        buttonPanel.add(board4);
        buttonPanel.add(board5);
        boardChoicePanel.add(choice);
        boardChoicePanel.add(buttonPanel);
        boardChoicePanel.add(startButton);

        //added panel for player three and four
        startWindowPanel.add(headline, Helper.buildBoardConstraints(startWindowConstraints, 0, 0, 1, 2));
        startWindowPanel.add(playerOnePanel, Helper.buildBoardConstraints(startWindowConstraints, 1, 0, 1, 1));
        startWindowPanel.add(playerTwoPanel, Helper.buildBoardConstraints(startWindowConstraints, 1, 1, 1, 1));
        startWindowPanel.add(playerThreePanel, Helper.buildBoardConstraints(startWindowConstraints, 2, 0, 1, 1));
        startWindowPanel.add(playerFourPanel, Helper.buildBoardConstraints(startWindowConstraints, 2, 1, 1, 1));
        startWindowPanel.add(boardChoicePanel, Helper.buildBoardConstraints(startWindowConstraints, 3, 0, 1, 2));

        frame.setContentPane(startWindowPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        return frame;
    }

    public JButton createButton(String text, Color color, String actionCommand) {
        JButton button = new JButton(text);
        button.setBackground(color);
        button.setBorder(BorderFactory.createLineBorder(new Color(228, 229, 227), 2));
        button.addActionListener(this);
        button.setActionCommand(actionCommand);

        return button;
    }

    // Highlights the first Button in given Array
    public void highlightButton(JButton activeButton, JButton notActiveButton1, JButton notActiveButton2) {
        notActiveButton1.setBorder(BorderFactory.createLineBorder(new Color(228, 229, 227), 2));
        notActiveButton2.setBorder(BorderFactory.createLineBorder(new Color(228, 229, 227), 2));
        activeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    public void highlightButtonBoard(JButton activeButton, JButton notActiveButton1, JButton notActiveButton2,JButton notActiveButton3,JButton notActiveButton4) {
        notActiveButton1.setBorder(BorderFactory.createLineBorder(new Color(228, 229, 227), 2));
        notActiveButton2.setBorder(BorderFactory.createLineBorder(new Color(228, 229, 227), 2));
        notActiveButton3.setBorder(BorderFactory.createLineBorder(new Color(228, 229, 227), 2));
        notActiveButton4.setBorder(BorderFactory.createLineBorder(new Color(228, 229, 227), 2));
        activeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    //added color for player three and four
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("playerOneColorButton1")) {
            highlightButton(playerOneColorButton1, playerOneColorButton2, playerOneColorButton3);
            controller.setPlayerOneColor(playerOneColorButton1.getBackground());
        }
        if (e.getActionCommand().equals("playerOneColorButton2")) {
            highlightButton(playerOneColorButton2, playerOneColorButton1, playerOneColorButton3);
            controller.setPlayerOneColor(playerOneColorButton2.getBackground());
        }
        if (e.getActionCommand().equals("playerOneColorButton3")) {
            highlightButton(playerOneColorButton3, playerOneColorButton1, playerOneColorButton2);
            controller.setPlayerOneColor(playerOneColorButton3.getBackground());
        }
        if (e.getActionCommand().equals("playerTwoColorButton1")) {
            highlightButton(playerTwoColorButton1, playerTwoColorButton2, playerTwoColorButton3);
            controller.setPlayerTwoColor(playerTwoColorButton1.getBackground());
        }
        if (e.getActionCommand().equals("playerTwoColorButton2")) {
            highlightButton(playerTwoColorButton2, playerTwoColorButton1, playerTwoColorButton3);
            controller.setPlayerTwoColor(playerTwoColorButton2.getBackground());
        }
        if (e.getActionCommand().equals("playerTwoColorButton3")) {
            highlightButton(playerTwoColorButton3, playerTwoColorButton1, playerTwoColorButton2);
            controller.setPlayerTwoColor(playerTwoColorButton3.getBackground());
        }
        if(e.getActionCommand().equals("playerThreeColorButton1")) {
            highlightButton(playerThreeColorButton1, playerThreeColorButton2, playerThreeColorButton3);
            controller.setPlayerThreeColor(playerThreeColorButton1.getBackground());
        }
        if(e.getActionCommand().equals("playerThreeColorButton2")) {
            highlightButton(playerThreeColorButton2, playerThreeColorButton1, playerThreeColorButton3);
            controller.setPlayerThreeColor(playerThreeColorButton2.getBackground());
        }
        if(e.getActionCommand().equals("playerThreeColorButton3")) {
            highlightButton(playerThreeColorButton3, playerThreeColorButton1, playerThreeColorButton2);
            controller.setPlayerThreeColor(playerThreeColorButton3.getBackground());
        }
        if(e.getActionCommand().equals("playerFourColorButton1")) {
            highlightButton(playerFourColorButton1, playerFourColorButton2, playerFourColorButton3);
            controller.setPlayerFourColor(playerFourColorButton1.getBackground());
        }
        if(e.getActionCommand().equals("playerFourColorButton2")) {
            highlightButton(playerFourColorButton2, playerFourColorButton1, playerFourColorButton3);
            controller.setPlayerFourColor(playerFourColorButton2.getBackground());
        }
        if(e.getActionCommand().equals("playerFourColorButton3")) {
            highlightButton(playerFourColorButton3, playerFourColorButton1, playerFourColorButton2);
            controller.setPlayerFourColor(playerFourColorButton3.getBackground());
        }

        if (e.getActionCommand().equals("board1")) {
            highlightButtonBoard(board1, board2, board3, board4, board5);
            controller.setBoardChoice("board1");
        }
        if (e.getActionCommand().equals("board2")) {
            highlightButtonBoard(board2, board1, board3, board4, board5);
            controller.setBoardChoice("board2");
        }
        if (e.getActionCommand().equals("board3")) {
            highlightButtonBoard(board3, board1, board2, board4, board5);
            controller.setBoardChoice("board3");
        }
        if (e.getActionCommand().equals("board4")) {
            highlightButtonBoard(board4, board1, board2, board3, board5);
            controller.setBoardChoice("board4");
        }
        if (e.getActionCommand().equals("board5")) {
            highlightButtonBoard(board5, board1, board2, board3, board4);
            controller.setBoardChoice("board5");
        }
        //added condition for player three and four
        if (e.getActionCommand().equals("startButton") &&
            controller.colorsSet() &&
            controller.boardChosen() &&
            !playerOneName.getText().isBlank() &&
            !playerTwoName.getText().isBlank() &&
            !playerThreeName.getText().isBlank() &&
            !playerFourName.getText().isBlank() &&
            !playerOneName.getText().equals(playerTwoName.getText())) {

            controller.startGame(playerOneName.getText(), playerTwoName.getText(), playerThreeName.getText(), playerFourName.getText());
        }
    }
}
