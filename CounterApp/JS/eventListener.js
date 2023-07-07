

let a=function(){
    alert("hello   1 ")
}

let b=function(){

    alert("hello 2")
}



document.getElementById("btn")
.addEventListener("click",a)
 
document.getElementById("btn")
.addEventListener("click",b)





let p=prompt("enter your number")

if(p=="2"){
    document.getElementById("btn")
    .removeEventListener("click",b)
    
}