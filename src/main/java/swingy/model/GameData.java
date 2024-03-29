package swingy.model;

public class GameData {

    public String getGameOverHeader() {
        return  "\n    ::::::::::           :::::        ::::::      ::::::  ::::::::           ::::::::    ::            :: :::::::  :::::     " +
                "\n  :::        :::        ::   ::       :::  ::    ::  :::  :::               ::      ::    ::          ::  :::      ::   ::   " +
                "\n :::                   ::     ::      :::   ::  ::   :::  ::               ::        ::    ::        ::   ::       ::    ::  " +
                "\n :::         :::::    :::::::::::     :::     :::    :::  ::::::::        ::          ::    ::      ::    :::::::  ::   ::   " +
                "\n :::          :::    ::         ::    :::            :::  ::               ::        ::      ::    ::     ::       :: :::    " +
                "\n  :::        :::    ::           ::   :::            :::  :::               ::      ::        ::  ::      :::      ::   ::   " +
                "\n    ::::::::::     ::             ::  :::            :::  ::::::::            :::::::          ::::       :::::::  ::    ::  ";
    }

    public  String getGameBeginHeader() {
        return         "/*********************************************************************************************************************/\n"+
                        "                         ######                                                                                      \n"+
                        "                       ###        ##                 ##    @@    ####   ##      ########     ##    ##                \n"+
                        "                         ###       ##               ##     ##    ## ##  ##    ###     ###     ##  ##                 \n"+
                        "                           ###      ##             ##      ##    ##  ## ##   ###               ####                  \n"+
                        "                             ###     ##    ##     ##       ##    ##    ###    ###    ######     ##                   \n"+
                        "                           ###        ##  ## ##  ##        ##    ##     ##     ###    ###       ##                   \n"+
                        "                       #####           ###    ###          ##    ##     ##       #######        ##                   \n"+
                        "/*********************************************************************************************************************/";
    }

    public String gameInstructions(){
        return  "\t\t\t\tHi, Welcome to Swingy at Text Base RPG....\n" +
                "\t\t\t\t##############################################################################\n"+
                "\t\t\t\tHere are Instructions on how to play:\n" +
                "\t\t\t\t-> Move North -> Hero goes upwards\n" +
                "\t\t\t\t-> Move East -> Hero goes Right\n" +
                "\t\t\t\t-> Move South -> Hero goes downwards\n" +
                "\t\t\t\t-> Move West -> Hero goes Left\n" +
                "\t\t\t\t-> Villains are in Red_-_ Heros are Blue\n"+
                "\t\t\t\t##############################################################################\n"+
                "\t\t\t\tHere are rules:\n" +
                "\t\t\t\t-> To win you need to pass the End of the MAP\n" +
                "\t\t\t\t-> To Advance to next Level You need to accumulate above 1000xp\n" +
                "\t\t\t\t-> The Map's are based on your level... \n" +
                "\t\t\t\t-> Fighting a Viilain can boost your XP \n" +
                "\t\t\t\t-> When Fighting a Villain, if you Lose you will die and start over.\n" +
                "\t\t\t\t     >>>  If you defeat a villain, You will get more powerful, Your XP,ATT,DEF,HP will Increase\n" +
                "\t\t\t\tGood Luck on your Journey... STAY AWAY FROM THANOS at a lower Level";
    }

    public  String leveledUp() {
        return
                "       LL     EEEEE V       V  EEEEE LL         u     u  pppppp                \n"+
                "       LL     EE     V     V   EE    LL         u     u  pp   pp             \n"+
                "       LL     EEEE    V   V    EEEE  LL         u     u  pppppp            \n"+
                "       LL     EE       V V     EE    LL         u     u  pp               \n"+
                "       LLLLLL EEEEE     V      EEEEE LLLLL      uuuuuuu  pp                \n";
    }

}
