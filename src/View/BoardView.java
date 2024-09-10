package View;

import Controller.BoardController;
import Config.Helper;
import Model.Country;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class BoardView extends JFrame implements ActionListener {
    public static final int DICE_ROW_HEIGHT = 50;
    public static final int ROW_WIDTH_OUTSIDE = 250;
    public static final int ROW_WIDTH_INSIDE = 700;
    public static final int FIELD_WIDTH = 1200;
    public static final int FIELD_HEIGHT = 800;
    public static final int STAT_ROW_HEIGHT = 50;

    public JLabel playerTurn;
    public JLabel currentPhase;

    public JButton attackButton;
    public JButton endTurnButton;

    public JButton playerOneCards;
    public JButton playerTwoCards;
    public JButton playerThreeCards; //added cards for player three
    public JButton playerFourCards; //added cards for player four

    //change to universal playerCards
    public JButton playerCards;

    GridBagLayout boardLayout = new GridBagLayout();
    GridBagConstraints boardConstraints = new GridBagConstraints();
    JPanel boardPanel = new JPanel(boardLayout);

    public Map<String, Country> allCountries;
    public BoardController boardController;
    public Map<String, CountryView> allCountryViews;

    public BoardView(String boardChoice, Map<String, Country> allCountries, BoardController boardController, Map<String, CountryView> allCountryViews) {
        super("Risk");
        this.allCountries = allCountries;
        this.boardController = boardController;
        this.allCountryViews = allCountryViews;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        boardLayout.columnWidths = new int[] {ROW_WIDTH_OUTSIDE, ROW_WIDTH_INSIDE, ROW_WIDTH_OUTSIDE};
        boardLayout.rowHeights = new int[] {DICE_ROW_HEIGHT, FIELD_HEIGHT, STAT_ROW_HEIGHT, STAT_ROW_HEIGHT};

        // Top row of game board
        playerTurn = new JLabel("Player Turn", JLabel.CENTER);
        playerTurn.setOpaque(true);
        playerTurn.setBackground(boardController.getCurrentPlayer().getPlayerColor());

        currentPhase = new JLabel("Current Phase", JLabel.CENTER);
        currentPhase.setOpaque(true);
        currentPhase.setBackground(Color.WHITE);


        endTurnButton = new JButton("End Phase");
        endTurnButton.addActionListener(this);
        endTurnButton.setActionCommand("End Phase");
        endTurnButton.setEnabled(false);

        // Country and continent creation depending on choice in Start Window
        JPanel allContinents = new JPanel();
        ContinentCreator continentCreator = new ContinentCreator(boardController);
        switch (boardChoice) {
            case "board1" -> {

                allContinents = new JPanel(new GridLayout(2, 2));
                JPanel continentOne = continentCreator.createBoard1("A", this.allCountries, this.allCountryViews);
                JPanel continentTwo = continentCreator.createBoard1("B", this.allCountries, this.allCountryViews);
                JPanel continentThree = continentCreator.createBoard1("C", this.allCountries, this.allCountryViews);
                JPanel continentFour = continentCreator.createBoard1("D", this.allCountries, this.allCountryViews);

                allContinents.add(continentOne);
                allContinents.add(continentTwo);
                allContinents.add(continentThree);
                allContinents.add(continentFour);
            }
            case "board2" -> allContinents = continentCreator.createBoard2(this.allCountries, this.allCountryViews);
            case "board3" -> allContinents = continentCreator.createBoard3(this.allCountries, this.allCountryViews);
            case "board4" -> allContinents = continentCreator.createBoard4(this.allCountries, this.allCountryViews); //added case for board 4
            case "board5" -> allContinents = continentCreator.createBoard5(this.allCountries, this.allCountryViews); //added case for board 5
        }
        allContinents.setBackground(new Color(153,204,255));

        // Bottom row of game board
        playerOneCards = new JButton(this.boardController.getCurrentPlayer().getName() + " Cards: 0" );
        playerOneCards.setBackground(Color.ORANGE);
        playerOneCards.setOpaque(true);
        playerOneCards.addActionListener(this);
        playerOneCards.setActionCommand("playerOneCards");

        playerTwoCards = new JButton(this.boardController.getCurrentPlayer().getName() + " Cards: 0" );
        playerTwoCards.setOpaque(true);
        playerTwoCards.setBackground(Color.ORANGE);
        playerTwoCards.addActionListener(this);
        playerTwoCards.setActionCommand("playerTwoCards");

        //Extension cards for player three
        playerThreeCards = new JButton(this.boardController.getCurrentPlayer().getName() + " Cards: 0" );
        playerThreeCards.setOpaque(true);
        playerThreeCards.setBackground(Color.ORANGE);
        playerThreeCards.addActionListener(this);
        playerThreeCards.setActionCommand("playerThreeCards");

        //Extension cards for player four
        playerFourCards = new JButton(this.boardController.getCurrentPlayer().getName() + " Cards: 0" );
        playerFourCards.setOpaque(true);
        playerFourCards.setBackground(Color.ORANGE);
        playerFourCards.addActionListener(this);
        playerFourCards.setActionCommand("playerFourCards");

        attackButton = new JButton("Attack");
        attackButton.addActionListener(this);
        attackButton.setActionCommand("fight");
        attackButton.setEnabled(false);


        boardPanel.add(playerTurn, Helper.buildBoardConstraints(boardConstraints,0,0,1,1));
        boardPanel.add(currentPhase, Helper.buildBoardConstraints(boardConstraints,0,1,1,1));
        boardPanel.add(endTurnButton, Helper.buildBoardConstraints(boardConstraints,0,2,1,1));
        boardPanel.add(allContinents, Helper.buildBoardConstraints(boardConstraints,1,0,1,3));
        boardPanel.add(playerOneCards, Helper.buildBoardConstraints(boardConstraints,2,0,1,1));
        boardPanel.add(playerTwoCards, Helper.buildBoardConstraints(boardConstraints,2,2,1,1));
        boardPanel.add(playerThreeCards, Helper.buildBoardConstraints(boardConstraints,3,0,1,1)); //Displays Cards of player three
        boardPanel.add(playerFourCards, Helper.buildBoardConstraints(boardConstraints,3,2,1,1)); //Displays Cards of player four
        boardPanel.add(attackButton, Helper.buildBoardConstraints(boardConstraints,2,1,2,1));

        boardPanel.setPreferredSize(new Dimension(FIELD_WIDTH, DICE_ROW_HEIGHT + FIELD_HEIGHT + STAT_ROW_HEIGHT + STAT_ROW_HEIGHT)); //added a second STAT_ROW_HEIGHT for player three & four
        setContentPane(boardPanel);

        pack();
        setLocationRelativeTo(null);
    }

    public void setPlayerTurnLabel(String text) {
        playerTurn.setText(text);
        playerTurn.setBackground(boardController.getCurrentPlayer().getPlayerColor());
    }

    public void setCurrentPhaseLabel(String text) {
        currentPhase.setText(text);
    }

    public void setEndTurnButtonText(String text) {
        endTurnButton.setText(text);
    }

    public void setPlayerOneCardsButtonText(String text) {
        playerOneCards.setText(text);
    }

    public void setPlayerTwoCardsButtonText(String text) { playerTwoCards.setText(text); }

    public void setPlayerThreeCardsButtonText(String text) { playerThreeCards.setText(text); } //setter player three

    public void setPlayerFourCardsButtonText(String text) { playerFourCards.setText(text); } //Setter player four

    public void setPlayerCardsButtonText(String text) { playerCards.setText(text); }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("fight")) {
            boardController.fightController.createFightView();
        }

//        if(boardController.getCurrentPlayer() == boardController.getPlayerOne() &&
//            e.getActionCommand().equals("playerOneCards") &&
//            boardController.getPlayerOne().getCards() >= 3 &&
//            (boardController.getPhase().equals("Attack Phase") || boardController.getPhase().equals("Fortification Phase")))
//        {
//            boardController.playerSetCardsPhase(boardController.getCurrentPlayer());
//        }
//        if(boardController.getCurrentPlayer() == boardController.getPlayerTwo() &&
//            e.getActionCommand().equals("playerTwoCards") &&
//            boardController.getPlayerTwo().getCards() >= 3 &&
//            (boardController.getPhase().equals("Attack Phase") || boardController.getPhase().equals("Fortification Phase")))
//        {
//            boardController.playerTwoSetCardsPhase();
//        }
//        //extended for player three
//        if(boardController.getCurrentPlayer() == boardController.getPlayerThree() &&
//                e.getActionCommand().equals("playerThreeCards") &&
//                boardController.getPlayerThree().getCards() >= 3 &&
//                (boardController.getPhase().equals("Attack Phase") || boardController.getPhase().equals("Fortification Phase")))
//        {
//            boardController.playerThreeSetCardsPhase();
//        }
//        //extended for player four
//        if(boardController.getCurrentPlayer() == boardController.getPlayerFour() &&
//                e.getActionCommand().equals("playerFourCards") &&
//                boardController.getPlayerFour().getCards() >= 3 &&
//                (boardController.getPhase().equals("Attack Phase") || boardController.getPhase().equals("Fortification Phase")))
//        {
//            boardController.playerFourSetCardsPhase();
//        }
//
//        if(e.getActionCommand().equals("End Phase")) {
//            boardController.endPhase();
//        }
    }
}
