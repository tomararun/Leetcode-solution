class Solution:
    def fractionAddition(self, expression: str) -> str:
        exp = expression.replace('+', ' +').replace('-', ' -').split()
        num, den = zip(*map(lambda x: x.split('/'), exp))
        mul = reduce(operator.mul, map(int, den))
        sm = sum(a*mul//b for a, b in zip(map(int, num), map(int, den)))
        return str(sm//gcd(sm, mul)) + '/' + str(mul//gcd(sm, mul))