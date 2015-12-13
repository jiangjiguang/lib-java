package com.jiangjg.lib.ThingkingInJava.Th20;

import java.util.List;

public class PasswordUtils {

	@UseCase(id=47, decription="")
	public boolean validPassword(String password){
		return password.matches("\\w*\\d\\w*");
	}
	@UseCase(id=48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id=49, decription="")
	public boolean checkForNewPassword(List<String> ps, String password){
		return !ps.contains(password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
