package com.dinesh.work

import scala.collection.immutable.ListMap

//Leetcode:
//14. Longest Common Prefix
//
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//  Example 1:
//  Input: strs = ["flower","flow","flight"]
//  Output: "fl"
//
//  Example 2:
//  Input: strs = ["dog","racecar","car"]
//  Output: ""
//  Explanation: There is no common prefix among the input strings.

object LongestCommonPrefix {

  def main(args: Array[String]): Unit = {

    val strs = List("flower","flower","flower","flowr")
    var InitList = List[String]()
    var OuterList = List[String]()

    //For each entry in the input list, find the length of string and get all possible substrings.
    //Add the substrings to main list and get the number of occurrences.
    //Get the word with max number of occurrences as same as length of initial input list

      if (strs.length == 1) println(strs.mkString)
      else
        strs.foreach(x => {
          var innerList = List[String]()
          for (i <- 0 to x.length) {
            //if (x.substring(0,i).length != 1)
            innerList = x.substring(0, i) :: innerList
          }
          InitList = innerList.filter(_.nonEmpty) ::: InitList
        }
        )
      val mapper = ListMap(InitList.groupBy(identity).mapValues(_.size).toMap.toSeq.sortWith(_._1 > _._1): _*)
      //println(mapper)
      for ((key, value) <- mapper) {
        if ( strs.length == value )
          OuterList = key :: OuterList
       }

    if(OuterList.isEmpty)
      println("")
      else
      {
        OuterList.sortWith(_.length < _.length)
        println("Longest possible common prefix: " + OuterList.last)
      }
    }
}