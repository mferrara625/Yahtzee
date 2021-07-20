package com.company;

public class Dice {
    public int num;
    public boolean isHeld;
    public int diceNum;
    String[] output;
    public final String[] ONE_FACE = new String[]{
            "  ________    ",
            "|\\  o    o \\  ",
            "|o\\ ________\\ ",
            "| o|         |",
            "'o |    o    |",
            " \\o|         |",
            "   '---------'"
    };
    public final String[] TWO_FACE = new String[]{
            "  ________    ",
            "|\\    o    \\  ",
            "|o\\ ________\\ ",
            "| o| o       |",
            "'o |         |",
            " \\o|       o |",
            "   '---------'"
    };
    public final String[] THREE_FACE = new String[]{
            "  ________    ",
            "|\\    o    \\  ",
            "|o\\ ________\\ ",
            "|  | o       |",
            "' o|    o    |",
            " \\ |       o |",
            "   '---------'"
    };
    public final String[] FOUR_FACE = new String[]{
            "  ________    ",
            "|\\    o    \\  ",
            "|o\\ ________\\ ",
            "|  | o     o |",
            "' o|         |",
            " \\ | o     o |",
            "   '---------'"
    };
    public final String[] FIVE_FACE = new String[]{
            "  ________    ",
            "|\\    o    \\  ",
            "|o\\ ________\\ ",
            "| o| o     o |",
            "'o |    o    |",
            " \\o| o     o |",
            "   '---------'"
    };
    public final String[] SIX_FACE = new String[]{
            "  ________    ",
            "|\\  o    o \\  ",
            "|o\\ ________\\ ",
            "| o| o     o |",
            "'o | o     o |",
            " \\o| o     o |",
            "   '---------'"
    };

    public Dice(int diceNum){
        this.diceNum = diceNum;
        this.num = 0;
        this.isHeld = false;
    }
    public void rollDice(){
        if(!isHeld)
            num = (int)(Math.random() * 6) + 1;
    }
    public void setDice(){

        if(num == 1){
            output =  ONE_FACE;
        }
        if(num == 2){
            output =  TWO_FACE;
        }
        if(num == 3){
            output =  THREE_FACE;
    }
        if(num == 4){
            output =  FOUR_FACE;
        }
        if(num == 5){
            output =  FIVE_FACE;
        }
        if(num == 6){
            output =  SIX_FACE;
        }
}
}

