package com.dinesh.work

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
//that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
//
//Example 1:
//
//  Input: nums = [-1,0,1,2,-1,-4]
//  Output: [[-1,-1,2],[-1,0,1]]
//  Explanation:
//    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//    The distinct triplets are [-1,0,1] and [-1,-1,2].
//    Notice that the order of the output and the order of the triplets does not matter.

object TripletSum {

  def main(args: Array[String]): Unit = {

    val nums = List(-1,-1,2,-1,0,1)
    //val nums = List(0,0,0)

    if (nums.length % 3 !=0) println(List())
    else {
      val combinations = nums.combinations(3).filter(ListElement=> ListElement.sum==0).toList
      if (combinations.isEmpty) println(List())
      else println(combinations)
    }
  }
}
