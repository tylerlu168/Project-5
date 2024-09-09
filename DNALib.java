public class DNALib
{
    public static boolean validator(String dna)
    {
        if(dna.length() % 3 != 0 ||dna.isEmpty() || dna.substring(0, 3).contains("B") || dna.substring(0, 3).contains("D") || dna.substring(0, 3).contains("E") || dna.substring(0, 3).contains("F") || dna.substring(0, 3).contains("H") || dna.substring(0, 3).contains("I") || dna.substring(0, 3).contains("J") || dna.substring(0, 3).contains("K") || dna.substring(0, 3).contains("L") || dna.substring(0, 3).contains("M") || dna.substring(0, 3).contains("N") || dna.substring(0, 3).contains("O") || dna.substring(0, 3).contains("P") || dna.substring(0, 3).contains("Q") || dna.substring(0, 3).contains("R") || dna.substring(0, 3).contains("S") || dna.substring(0, 3).contains("U") || dna.substring(0, 3).contains("V") || dna.substring(0, 3).contains("W") || dna.substring(0, 3).contains("X") || dna.substring(0, 3).contains("Y") || dna.substring(0, 3).contains("Z"))
        {
           return false;
        }
        if(dna.length() == 3)
        {
            if(dna.substring(0, 1).equals("A") || dna.substring(1, 2).equals("A") || dna.substring(2, 3).equals("A") || dna.substring(0, 1).equals("C") || dna.substring(1, 2).equals("C") || dna.substring(2, 3).equals("C") || dna.substring(0, 1).equals("G") || dna.substring(1, 2).equals("G") || dna.substring(2, 3).equals("G") || dna.substring(0, 1).equals("T") || dna.substring(1, 2).equals("T") || dna.substring(2, 3).equals("T"))
            {
                return true;
            }
            else
            {
             return false;
            }
        }

        return validator(dna.substring(3));





        /*
        if(!dna.isEmpty() || dna.length() % 3 == 0)
        {
            return true;
        }

        if(dna.substring(0, 1).equals("A") || dna.substring(0, 1).equals("C") || dna.substring(0, 1).equals("G") || dna.substring(0, 1).equals("T"))
        {
            return validator(dna.substring(1));
        }
        else
        {
            return false;
        }*/




    }
    public static String reverser(String dna)
    {
        if(dna.length() == 1) {
            return dna.substring(0);
        }
        return dna.substring(dna.length()-1) + reverser(dna.substring(0,dna.length() - 1));
    }
    public static String inverser(String dna)
    {
        String str = "";
        if(dna.length() == 1)
        {
            if(dna.substring(0, 1).equals("A"))
            {
                return "T";
            }
            else if(dna.substring(0, 1).equals("C"))
            {
                return "G";
            }
            else if(dna.substring(0, 1).equals("G"))
            {
                return "C";

            }
            else if(dna.substring(0, 1).equals("T"))
            {
                return "A";
            }

        }
        else {
            if(dna.substring(0, 1).equals("A"))
            {
                str = "T";
            }
            else if(dna.substring(0, 1).equals("C"))
            {
                str = "G";
            }
            else if(dna.substring(0, 1).equals("G"))
            {
                str = "C";

            }
            else if(dna.substring(0, 1).equals("T"))
            {
                str = "A";
            }
        }
        return (str + inverser(dna.substring(1)));

    }

    public static String translator(String dna)
    {
        String str = "";
        switch(dna.substring(0, 3)){
            case "GCA":
            case "GCC":
            case "GCG":
            case "GCT":
                str = "A";
                break;
            case "TGC":
            case "TGT":
                str = "C";
                break;
            case "GAC":
            case "GAT":
                str = "D";
                break;
            case "GAA":
            case "GAG":
                str = "E";
                break;
            case "TTC":
            case "TTT":
                str = "F";
                break;
            case "GGA":
            case "GGC":
            case "GGG":
            case "GGT":
                str = "G";
                break;
            case "CAC":
            case "CAT":
                str = "H";
                break;
            case "ATA":
            case "ATC":
            case "ATT":
                str = "I";
                break;
            case "AAA":
            case "AAG":
                str = "K";
                break;
            case "CTA":
            case "CTC":
            case "CTG":
            case "CTT":
            case "TTA":
            case "TTG":
                str = "L";
                break;
            case "ATG":
                str = "M";
                break;
            case "AAT":
            case "AAC":
                str = "N";
                break;
            case "CCA":
            case "CCC":
            case "CCG":
            case "CCT":
                str = "P";
                break;
            case "CAA":
            case "CAG":
                str = "Q";
                break;
            case "AGA":
            case "AGG":
            case "CGA":
            case "CGC":
            case "CGG":
            case "CGT":
                str = "R";
                break;
            case "AGC":
            case "AGT":
            case "TCA":
            case "TCC":
            case "TCG":
            case "TCT":
                str = "S";
                break;
            case "ACA":
            case "ACC":
            case "ACG":
            case "ACT":
                str = "T";
                break;
            case "GTA":
            case "GTC":
            case "GTG":
            case "GTT":
                str = "V";
                break;
            case "TGG":
                str = "W";
                break;
            case "TAC":
            case "TAT":
                str = "Y";
                break;
            case "TAA":
            case "TAG":
            case "TGA":
                str = "-";
                break;
        }

        if(dna.length() == 3)
        {
            return str;
        }

        return (str + translator(dna.substring(3)));
    }


}
