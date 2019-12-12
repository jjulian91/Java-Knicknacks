public class Die {

    private int facevalue;

    private final int MAX =6;

    public Die() {
        facevalue= 1;  // Creates a starting face value for the dice.
    }

    public int roll() {
        //================================================================================
        // Roll the dice by setting each of the dice to be a random number between 1 and 6.
        //================================================================================
        facevalue = (int)(Math.random()*MAX) + 1;

        return facevalue;
    }

    public int setfacevalue(int value) {
        //================================================================================
        // Sets face value to any given integer * Dead code, never used*
        //================================================================================
        facevalue = value;

        return facevalue;
    }

    public int getfacevalue() {
        //================================================================================
        // Returns the current value of the die.
        //================================================================================
        return facevalue;
    }
    public String toString (){
        //================================================================================
        // Returns die from integer to String.
        //================================================================================

        String result = Integer.toString(facevalue);

        return result;
    }

}