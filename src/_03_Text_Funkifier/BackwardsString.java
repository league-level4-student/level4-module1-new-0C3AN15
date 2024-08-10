package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	String temp = "";
    	for(int i=unfunkifiedText.length()-1; i>-1; i--) {
    		char tempp = unfunkifiedText.charAt(i);
    		temp = temp + tempp;
    	}
        return temp;
    }
}
