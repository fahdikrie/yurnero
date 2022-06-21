class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        counter = 0
        maxcounter = 0

        for num in nums:
            if num == 1:
                counter += 1
            else:
                counter = 0

            if counter > maxcounter:
                maxcounter = counter

        return maxcounter