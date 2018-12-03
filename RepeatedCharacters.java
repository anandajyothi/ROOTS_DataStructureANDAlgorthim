package ds.string;




public class RepeatedCharacters {

    /**
    * @param args
    */

    public static void main( String[] args) {
        
        String input = "aabccccaaa" ;
        System.out.println(getRepeatedCounts(input));
    }
    
    public static String getRepeatedCounts(String input) {
        
        char[] inputChar = input.toCharArray();
        String output = "";
        char prev = inputChar[0];
        int count = 1;
        for(int i=1; i<inputChar.length; i++) {
            
            if(prev == inputChar[i]) {
                
                count ++;
            }else {
                output+= count + "" + prev; 
                prev = inputChar[i];
                count = 1;
                
            }
            
        }
        
        
        output+= count + "" + prev; 
        
        if(output.length() > input.length()) {
            
            output = input;
        }
        return output;
        
        
    }

}

