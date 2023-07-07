
// function myFun(){

//    let p= prompt("enter your name")
//   document.write(p)

// }



// let e=document.getElementById("p1")
// e.innerHTML=myFun()


//This example finds the form element with id="frm1", in the forms collection, and displays all element values:

// const x = document.forms["frm1"];
// let text = "";
// for (let i = 0; i < x.length; i++) {
//   text += x.elements[i].value + "<br>";
// }
// document.getElementById("demo").innerHTML = text;


// -------------------------------------------

//Changing the Value of an Attribute

let img=document.getElementById("image");
img.src="Img/images.jpeg"

// -----------------------


let d=document.getElementById("date");

d.innerHTML="date"+new Date()   


//
function validate(){
let f=document.forms["form1"]["fname"].value;

if(f==""){

    alert("please fill out the form")

    return false;
}



}