package com.jiangjg.lib.ThingkingInJava.Th19;

public interface Competitor<T extends Competitor<T>> {
	Outcome compete(T competitor);
}
