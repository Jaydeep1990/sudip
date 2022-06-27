package dataTypePkg;

import java.io.FileInputStream;
//data type
public class DataTypes {

	public static void main(String[] args) {
		// I am going to learn data types now
		/*
		 * Types of Data Type  - 2 Types
		 * 1 - Primitive Data Type - Pre-defined in Java(8)
		 * 		a - byte
		 * 		b - short
		 * 		c - int
		 * 		d - long
		 * 		e - float
		 * 		g - double
		 * 		h - char
		 * 		i - boolean
		 * 2 - Non Primitive Data Type - User Defined in Java
		 * 		a - String
		 * 		b - array
		 * 		c - Object
		 */
		//int (Integer) - Holds Numeric Data
		int sachinAge;//declaration
		sachinAge = 25;//Assignment (= Assignment Operator)
		int adarshAge = 35;//Initialization
		//adarshAge is a variable of type integer, which holds a value 35
		System.out.println(adarshAge);
		adarshAge = 45;//re-assignment
		System.out.println(adarshAge + adarshAge);
		//adarshAge = 45.6; - decimal not possible
		adarshAge = 'a';
		System.out.println(adarshAge);
		//double - Holds numeric as well as decimal data
		double anujaSalary = 100.105678;
		System.out.println(anujaSalary);
		anujaSalary = 200;
		System.out.println(anujaSalary);
		
		char gender = '9';
		System.out.println(gender);
		gender = 97;
		System.out.println(gender);
		
		System.out.println(2>10);//false,true
		/*
		 * Conditional Operator - >, <, >or=, <=, ==, !=
		 * Every Condition returns either true or false
		 * Data Type Hold True/False - boolean
		 * Every condition returns boolean data type 
		 */
		boolean isKaveriCurrentEmp = true;
		
		int anujaAge = 23;//  23, 24 , 25
		int sampadaAge = 23;//21, 26 , 25
		
		//Conditional Loop
		//if Syntax
		if(anujaAge > sampadaAge){//23<23
			//if condition pass/true
			System.out.println("Sampada is younger");
		}else{
			//if condition fails/false
			if(anujaAge==sampadaAge){
				System.out.println("Both are having same age");
			}else{
				System.out.println("Anuja is younger");
			}
		}
	}
}
/*
 * OR   
 * 1   0   -   1
 * 0   1   -   1
 * 1   1   -   1
 * 0   0   -   0
 * AND
 * 1   0   -   0
 * 0   1   -   0
 * 1   1   -   1
 * 0   0   -   0
 */



