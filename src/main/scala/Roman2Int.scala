package com.dinesh.work

//Leetcode:
// 13. Roman to Integer
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//  Symbol       Value
//  I             1
//  V             5
//  X             10
//  L             50
//  C             100
//  D             500
//  M             1000
//For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//  I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.
//
//  Example 1:
//  Input: s = "III"
//  Output: 3
//  Explanation: III = 3.
//
//  Example 2:
//  Input: s = "LVIII"
//  Output: 58
//  Explanation: L = 50, V= 5, III = 3.
//
//  Example 3:
//  Input: s = "MCMXCIV"
//  Output: 1994
//  Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

object Roman2Int {


  def roman2intFunc( romanval:String): Int = {

    var sum=0
    var i=0

    //Create Roman numerals Map
    val RomanMap= scala.collection.mutable.Map( "M" -> 1000,
      "D"  -> 500, "C"  -> 100,
      "L"  -> 50,  "X"  -> 10,
      "I"  -> 1,   "IV" -> 4,
      "V"  -> 5,   "IX" -> 9,
      "CM" -> 900, "CD" -> 400,
      "XC" -> 90,  "XL" -> 40 )

    //For string length iterate over and get substring (at max 2 char) and search. If found sum it up otherwise get single char and sum it up
    while(i<romanval.length) {

      if ( ( i+1 < romanval.length) && RomanMap.contains(romanval.substring(i,i+2)) ) {
        sum = sum + RomanMap(romanval.substring(i,i+2).mkString)
        i+=2 }
      else {
        sum = sum + RomanMap(romanval.substring(i,i+1).mkString)
        i+=1 }
    }
    sum
  }

  def main(args: Array[String]): Unit = {

    //val romanval="MCMXCIV" //val romanval="III"

    println("Enter the input\n")
    val inputval=scala.io.StdIn.readLine()

 println(roman2intFunc(inputval))

  }
}

