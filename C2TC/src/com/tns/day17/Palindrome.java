//Program to define generic functional interface Palindrome

package com.tns.day17;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
