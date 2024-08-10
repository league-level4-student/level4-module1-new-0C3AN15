package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    
    public interface TextFunkifier {
    	
    }
    
    public String funkifyText() {
    	String temp = "";
    	for(int i=0; i<unfunkifiedText.length(); i++) {
    		char tempp = unfunkifiedText.charAt(i);
    		String filler = tempp + "";
    		if(i%2 == 1) {
    			filler.toLowerCase();
    			System.out.println("lowe");
    		}
    		else if(i%2 == 0){
    			filler.toUpperCase();
    		}
    		System.out.println(filler);
    		temp = temp + filler;
    	}
    	System.out.println(temp);
        return "tHiS Is aLsO A TeSt";
        //"tHiS Is aLsO A TeSt"
    }

}
