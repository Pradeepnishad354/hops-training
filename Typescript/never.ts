function tryReturn(){

    return true;
}

console.log(tryReturn())


function apiError(msg,code):never{

throw{message:msg,apiCode:code}

}
console.log("internal server error ",500)


// execute multiple file ij ts 
// use tsc -w command 