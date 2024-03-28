package votingconstitutionalmonarchy;

public class MainGame {

    public void startGame(GameGUI gameGUI){
        int startRounds = 10;
        gameGUI.startGame(startRounds);
    }

    public void updateRound(){

    }

    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
        GameGUI gameGUI = new GameGUI();
        gameGUI.guiGen();
        gameGUI.setVisible(true);
        mainGame.startGame(gameGUI);
    }

    public static void Quit(){
        System.exit(0);
    }

}