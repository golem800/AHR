package token;

public class Token {
	
	private TokenMediator mediator;
	private int location;

	public Token(int newLoc){
		mediator.registerToken(this);
		location = -1;
		assert moveToken(newLoc) : "Cannot place token";
	}
	public Boolean moveTokenCheck(int newLoc){
		return false;
	}
	public Boolean moveToken(int newLoc){
		return false;
	}
}
