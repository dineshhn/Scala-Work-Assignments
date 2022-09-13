package com.dinesh.work

object Roman2Int {


  def roman2intFunc( romanval:String): Int = {

    var sum=0
    var i=0

    val RomanMap= scala.collection.mutable.Map( "M" -> 1000,
      "D"  -> 500, "C"  -> 100,
      "L"  -> 50,  "X"  -> 10,
      "I"  -> 1,   "IV" -> 4,
      "V"  -> 5,   "IX" -> 9,
      "CM" -> 900, "CD" -> 400,
      "XC" -> 90,  "XL" -> 40 )

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

    val romanval="MCMXCIV"
    //val romanval="III"
    println("Enter the input\n")
    val inputval=scala.io.StdIn.readLine()

 println(roman2intFunc(inputval))

  }
}

