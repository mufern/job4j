package ru.job4j.max;


/**
 * @author Mufazalov Ernst
 * @version $Id$
 * @since 0.1
 */
 public class Max {
	 public int summation(int first, int second){
		 return first + second;
	 }
 public int max(int first, int second, int third)
 {
	 if (first>second && first>third) {
		 return first;
	 } else if (second>first && second>third) {
		 return second;
	 } else {
         return third;
	 }
 } 
 }