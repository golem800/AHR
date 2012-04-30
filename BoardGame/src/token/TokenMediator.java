package token;

import java.util.List;


public abstract class TokenMediator {
	/*
	public abstract Boolean checkTokenMove();
	public abstract Boolean moveToken();
	
	private int maxLocation; //locations in game range from 0 to maxLocation
	*/
	
	public void registerToken(Token toAdd){
		gameTokens.add(toAdd);
	}	
	public Boolean moveTokenCheck(Token toCheck, int newLoc){
		return false;
	}
	public Boolean moveToken(Token toMove, int newLoc){
		return false;
	}

	private int _maxLocation; //locations in game range from 0 to maxLocation
	private List<Token> gameTokens;
	
}
