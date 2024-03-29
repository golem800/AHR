package token;

import java.util.ArrayList;
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
	public Boolean checkMove(Token toCheck, int newLoc){
		return false;
	}
	public Boolean moveToken(Token toMove, int newLoc){
		return false;
	}
	public List<Token> tokensAtLoc(int location){
		List<Token> tokens = new ArrayList<Token>();
		return tokens;
	}
	public int[] getLegalMoves(Token toMove){
		return new int[]{1,2};
	}
	public void moveMonsters(){
		
	}

	private int _maxLocation; //locations in game range from 0 to maxLocation
	private List<Token> gameTokens;	
}
