//Define Functional Interface MyCube
package com.tns.day17;

@FunctionalInterface
public interface MyCube {
	int getCube(int no);
	//void show(); not allow more than one abstract method
}
