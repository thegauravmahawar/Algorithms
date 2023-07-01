// Leetcode Question: https://leetcode.com/problems/two-sum/

package main

import "fmt"

func twoSum(nums []int, target int) []int {
	cache := make(map[int]int)
	for index, num := range nums {
		idx1, prs := cache[num]
		if prs {
			return []int{idx1, index}
		} else {
			cache[target-num] = index
		}
	}
	return []int{}
}

func main() {
	fmt.Println(twoSum([]int{2, 7, 11, 15}, 9))
}
