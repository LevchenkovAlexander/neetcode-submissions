class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        return sorted(s) == sorted(t)

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = [[strs[0]]]
        for s in strs[1:]:
            for an in ans:
                if self.isAnagram(s, an[0]):
                    an.append(s)
                    break
            else:
                ans.append([s])


        return ans