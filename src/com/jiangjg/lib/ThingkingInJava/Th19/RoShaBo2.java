package com.jiangjg.lib.ThingkingInJava.Th19;
import static com.jiangjg.lib.ThingkingInJava.Th19.Outcome.*;

public enum RoShaBo2 implements Competitor<RoShaBo2>{
	PAPER(DRAN,LOSE,WIN),
	SCISSORS(WIN,DRAN,LOSE),
	POCK(LOSE,WIN,DRAN);
	private Outcome vPAPER,vSCISSORS,vPOCK;
	RoShaBo2(Outcome p, Outcome s, Outcome r) {
		this.vPAPER = p;
		this.vSCISSORS = s;
		this.vPOCK = r;
	}
	@Override
	public Outcome compete(RoShaBo2 competitor) {
		// TODO Auto-generated method stub
		switch(competitor){
			default:
			case PAPER: return vPAPER;
			case SCISSORS: return vSCISSORS;
			case POCK: return vPOCK;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	

}
