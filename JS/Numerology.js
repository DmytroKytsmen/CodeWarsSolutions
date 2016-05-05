/**
 * Your solution
 * @date JS Date object
 **/
function solution(date){
    var sum = date.getDate() + 1+date.getMonth() + date.getFullYear();
    while(sum > 9) sum = Math.floor(sum/10) + (sum%10);
    return sum;
}