//alert("this is testing msg")

let a=[10,30,40,44,33]

console.warn(a)
console.warn(a[0])

document.write(a)
document.write(typeof a)



var ob={'name':'pradeep'}

document.write(ob['name']+"<br>")

document.write(typeof 'name')



document.write("<br>")
var n=prompt("enter the number")

var b=parseInt(n)

if(b>0){

    document.write("positive")

}else if(b<0){
    document.write("negative")
}else{

    document.write("zero")
}


for(var i=1; i<=10; i++){

    document.write("<h1>hello world</h1>",i)

}

// sum

var s=0;
for(var i=1; i<=10; i++){

   s= s+i;


}
document.write("sum is"+s)



//while loop

// var i=1;
// while(10>i){

// document.write("mahadev" ,i)

// }

function sayHello(){

document.write("hello world")

}
//calling function
document.write("<br>")
sayHello()


function doSum(a,b){

    return a+b;
}
var result=doSum(3,4)
document.write("<h1>",result,"</h1>")


document.write("<hr>")

function changeContent(){

    var element=document.getElementById("change-content")

    element.innerHTML="this is new content";
}