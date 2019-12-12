/** Authors: Jonathan Julian && Mark Codd
 *  Created : 10/16/2017
 *  Modified : 10/20/2017
 *  Class creates all instances of a temperature object--
 *  contains methods:
 *  Conversion of temperature object type/degree as requested by user
 *  Equality of two objects.
 *  Write current output.
 *  read user input
 *  write conversion factor/return conversion factor as variable.
 *  Set method to overwrite current values of class variables.
        */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Temperature {
    private DecimalFormat trunk = new DecimalFormat("0.#");
    private double degree;
    private char type;

    Scanner scan = new Scanner(System.in);
//=====================================================================================================================
//constructors for class. checks variables passed in when constructing and passes input to the correct set method.
//=====================================================================================================================
    public Temperature(double degree, char type)
    {
        set(degree,type);
    }
    public Temperature(char type)   { set(0.0,type); }

    public Temperature (double degree)  { set(degree,'C'); }

    public Temperature(){ set(0.0,'C'); }
//=====================================================================================================================
//writes current values of type and tempurature.
//=====================================================================================================================
    public void writeOutput()
    {
        degree = Math.round(degree*10.0)/10.0;
        System.out.println("Temperature = " + trunk.format(degree) + " degrees " + type);
    }
//=====================================================================================================================
//Prints value of current object as Celsius regardless of current type
//=====================================================================================================================
    public void writeC()
    {
        if (type == 'c' || type == 'C') {
            System.out.println("Temperature = " + trunk.format(degree )+ " degrees Celsius");
        }
        else {
            Double degrC =(5.0/9.0)*(degree-32.0);
            degrC = Math.round(degrC*10.0)/10.0;
            System.out.println("Temperature = " + trunk.format(degrC) + " degrees Celsius");
        }
    }
//=====================================================================================================================
//Prints the value of current object as Fahrenheit regardless of current type
//=====================================================================================================================
    public void writeF()
    {
        if (type == 'f'|| type== 'F') {

            System.out.println("Temperature = " + trunk.format(degree) + " degrees Fahrenheit");
        }
        else {
            double degrF =9.0/5.0*degree+32.0;
            degrF = Math.round(degrF*10.0)/10.0;
            System.out.println("Temperature = " + trunk.format(degrF) + " degrees Fahrenheit");
        }
    }
//=====================================================================================================================
// Creates instance of passed object and converts both to C and compares returns results of comparison.
//=====================================================================================================================
    public boolean equals(Object input)
    {
        boolean check = false;
        if(input instanceof Temperature) {
            Temperature tester = (Temperature) input;
            if(Double.parseDouble(tester.getC())==Double.parseDouble(this.getC()))
            check = true;
        }         return check;
    }
//=====================================================================================================================
//Checks for Current object type -- If C it returns the variable Degree, if F it converts input and returns new variable
//does NOT change objects type or variable.
//=====================================================================================================================
    public String getC()
    {
        double degreeC;
        if (type == 'C' || type == 'c')
            degreeC = Math.round(degree*10.0)/10.0;
        else {
            degreeC =(5.0/9.0)*(degree-32.0);
            degreeC = Math.round(degreeC*10.0)/10.0;
        }
        return toStringFormat(degreeC);
    }
//=====================================================================================================================
//Checks for Current object type -- If F it returns the variable Degree, if C it converts input and returns new variable
//does NOT change objects type or variable.
//=====================================================================================================================
    public String getF()
    {
        double degreeF;
        if (type == 'F'|| type=='f')
            degreeF = Math.round(degree * 10.0) / 10.0;
        else {
            degreeF =9.0/5.0*degree+32.0;
            degreeF = Math.round(degreeF*10.0)/10.0;
        }
        return toStringFormat(degreeF);
    }
//=====================================================================================================================
// Follow set methods check for input.  Assigns any input to class variables degree and or type --
// if input variable is missing the current value does not change.
//=====================================================================================================================
    public void set(double newDegree, char newType)
    {
        type = Character.toUpperCase(newType);
        degree = Math.round(newDegree*10.0)/10.0;

    }
    public void set (double newDegree){
        set(newDegree, type);
    }
    public void set(char newType){
        set(degree, newType);
    }
    public void readInput()
    {
        String response;
        char answer ='z';
            System.out.println("Enter a temperature in degrees:");
            degree = scan.nextDouble();
        while (answer != 'F' && answer != 'C'&&answer != 'c' && answer != 'f') {
            System.out.println("Enter F (or f) for Fahrenheit or C (or c) for Celsius:");
            response = scan.next();
            answer = response.charAt(0);
        }
        if (answer == 'C')
            type = 'C';
        else if (answer == 'F')
            type = 'F';
    }
//=====================================================================================================================
// Creates a string of current results
//=====================================================================================================================
    public String toString()
    {
        String Degree = trunk.format(degree);
        String Type = Character.toString(type);
        return Degree + " degrees " + Type;
    }
    private String toStringFormat(double input) {
        String output = trunk.format(input);
   return output;
    }
}