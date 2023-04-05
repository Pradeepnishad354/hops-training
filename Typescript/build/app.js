"use strict";
// const num:number=10;
// console.warn(num)
function add(a, b) {
    return a + b;
}
let result = add(10, 30);
console.log(result);
function dummy(a) {
    return a;
}
let result1 = dummy("hello world");
console.log(result1);
// inferenece
//let data=10
// any type 
let data;
data = 10;
data = "name";
data = true;
//constant
let m = 10;
const val = 10;
//any specific number 
let a;
a = 5;
