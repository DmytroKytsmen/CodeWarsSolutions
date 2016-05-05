Array.prototype.square = function(){
    return this.map((element) =>  Math.pow(element,2));}

Array.prototype.cube = function(){
    return this.map((element) =>  Math.pow(element,3));}

Array.prototype.sum = function(){
    return this.reduce((a,b) => a+b,0 );}

Array.prototype.average = function(){
    return this.reduce((a,b) => a+b,0 )/this.length;}

Array.prototype.even = function(){
    return this.filter((element) => element % 2 == 0);
}

Array.prototype.odd = function(){
    return this.filter((element) => element % 2 !== 0);
}