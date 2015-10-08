package com.jiangjg.lib.EffectiveJava;

public class Adventure {

	interface CanFight{
		void fight();
	}
	interface CanSwim{
		void swim();
	}
	class ActionCharacter{
		public void fight(){
			
		}
	}
	class Hero extends ActionCharacter implements CanFight,CanSwim{

		@Override
		public void swim() {
			// TODO Auto-generated method stub
			
		}

		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
