public class LCStarter {
    public int romToInt(String s){
        int converted = 0;

        char romNum = 0;
        String romNumPair = "";

        for(int i = 0; i < s.length() ; i++){
            romNum = s.charAt(i);

            if(i < s.length() - 1){//checks if iterator reached the end at which point no more pair values can occur.
                romNumPair =  "" + s.charAt(i) + s.charAt(i + 1); //converts current and next roman numeral to string
            }

            if(romNumPair.contentEquals("IV") || romNumPair.contentEquals("IX") ||
            romNumPair.contentEquals("XL") || romNumPair.contentEquals("XC") ||
                    romNumPair.contentEquals("CD") || romNumPair.contentEquals("CM")){
                //adds special cases
                switch(romNumPair){
                    case "IV" : converted += 4;
                    break;
                    case "IX" : converted += 9;
                    break;
                    case "XL" : converted += 40;
                    break;
                    case "XC" : converted += 90;
                    break;
                    case "CD" : converted += 400;
                    break;
                    case "CM" : converted += 900;
                    break;
                }
                i++;
            }else{
                //adds singular values
                switch (romNum) {
                    case 'I' : converted += 1;
                        break;
                    case 'V' : converted += 5;
                        break;
                    case 'X' : converted += 10;
                        break;
                    case 'L' : converted += 50;
                        break;
                    case 'C' : converted += 100;
                        break;
                    case 'D' : converted += 500;
                        break;
                    case 'M' : converted += 1000;
                        break;
                }
            }
        }

        return converted;
    }
}
