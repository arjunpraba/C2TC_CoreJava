//Program to demonstrate generic interface
package com.tns.day16;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

