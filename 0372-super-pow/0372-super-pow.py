class Solution:
    def superPow(self, a: int, b: List[int]) -> int:
        number = ''
        for digit in b:
            number += str(digit)
        number = int(number)
        return pow(a, number, 1337)     