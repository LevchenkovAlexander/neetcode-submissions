class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d = dict()
        for i in nums:
            if i in d.keys():
                d[i] += 1
            else:
                d[i] = 1
        sd = sorted(d.items(), key=lambda val: val[1], reverse = True)
        return [sd[i][0] for i in range(k)]

            