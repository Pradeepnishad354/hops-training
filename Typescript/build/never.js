"use strict";
function tryReturn() {
    return true;
}
console.log(tryReturn());
function apiError(msg, code) {
    throw { message: msg, apiCode: code };
}
console.log("internal server error ", 500);
// execute multiple file ij ts 
// use tsc -w command 
