function squareSum(numbers) {
    return numbers.reduce(function (sum, number) {
        return sum + (number * number);
    }, 0);
}