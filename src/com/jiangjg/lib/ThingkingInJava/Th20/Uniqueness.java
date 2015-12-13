package com.jiangjg.lib.ThingkingInJava.Th20;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique=true);
}
