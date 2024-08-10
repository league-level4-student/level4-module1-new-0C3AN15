package _03_Text_Funkifier;

public class SameString implements TextFunkifier{

	private String unfunkifiedText;

    public SameString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    
    public interface TextFunkifier {
    	
    }

	@Override
	public String funkifyText() {
		return unfunkifiedText;
	}
	
}
