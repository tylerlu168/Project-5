import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("[DNA Reverser and Translator]");
        System.out.print("Enter a sequence: ");
        String dnaInput = input.nextLine();
        dnaInput = dnaInput.toUpperCase();
        String output = dnaInput;
        if(DNALib.validator(dnaInput) == true)
        {
            System.out.println("Your DNA sequence reversed and translated is");

            output = DNALib.reverser(output);
            output = DNALib.inverser(output);
            output = DNALib.translator(output);

            System.out.println(output);
        }
        else if(DNALib.validator(dnaInput) == false)
        {
            System.out.println("Your DNA sequence is not valid.");
        }
    }
}