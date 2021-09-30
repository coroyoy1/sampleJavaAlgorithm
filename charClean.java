public class charClean {
    public static void main(String[] args) {
        String identifier = "MyΟβιεγτFinder";
        System.out.println(cleanString(identifier));
    }


    public static String cleanString(String identifier){

        char[] identify = identifier.toCharArray();
        String str = "";
        for(int i = 0; i < identify.length; i++){
            if(identify[i] == ' '){
                str = str.replaceAll(" ", "");
            }
            else if(Character.isISOControl(identify[i])){
                str = String.valueOf(identify);
                str = str.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "CTRL");
            }
            else if(identify[i] == '-'){
                identify[i + 1] = Character.toUpperCase(identify[i + 1]);
                str = String.valueOf(identify);
                str = str.replaceAll("-", "");
            }
            else if(identify[i] >= 'α' && identify[i] <= 'ω' && Character.isLetter(identify[i])){
                str = String.valueOf(identify);
                str = str.replaceAll("\\p{InGreek}", "");
            }
        }
        return str;
    }

    static String clean(String identifier) { 
        StringBuilder strBuilder = new StringBuilder();
        for (int index = 0; index < identifier.length(); index++) {
            //Get each characters from the String identifier
            char eachChar = identifier.charAt(index);
            
            //Replace "whitespaces" into "underscores"
            if (Character.isWhitespace(eachChar)) { 
                strBuilder.append('_'); 
            } 
            
            //Replace "control characters" into "CTRL" word
            else if (Character.isISOControl(eachChar)) { 
                strBuilder.append("CTRL");
            } 
            
            //Remove "-" (kebab case) and next to it, convert lowercase into uppercase
            else if (eachChar == '-') {
                index++;
                strBuilder.append(Character.toUpperCase(identifier.charAt(index)));
            } 
            
            //Omit Greek lower case letters
            else if (String.valueOf(eachChar).matches("\\p{InGreek}")&& Character.isLowerCase(eachChar)) {
                //Nothing to do here.
            } 
            else if (Character.isAlphabetic(eachChar)) {
                strBuilder.append(eachChar);
            }
        }
        return strBuilder.toString();
    }
}
