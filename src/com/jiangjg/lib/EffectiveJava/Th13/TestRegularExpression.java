package com.jiangjg.lib.EffectiveJava.Th13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("usage");
			System.exit(0);
		}
		System.out.println("Input: \"" + args[0] + "\"");
		for (String arg : args) {
			System.out.println("Regeular: " + arg);
			Pattern p = Pattern.compile(arg);
			
			Matcher m = p.matcher(args[0]);
			while(m.find()){
				System.out.println("match: " + m.group() + "-" + m.start() + "-" + (m.end()-1));
			}
			Pattern pattern = Pattern.compile("abc+");
			Matcher matcher = pattern.matcher("abcabcabc");
			System.out.println(matcher.matches());
			System.out.println(matcher.lookingAt());
			System.out.println(matcher.find());
		}

	}

}
