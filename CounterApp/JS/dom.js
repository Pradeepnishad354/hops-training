
// const changedBgRed=()=>{

// document.body.firstElementChild.style.background="green";

// }



// let a=document.body

// console.log("the firstchild a is:"+a.firstChild)
// console.log("the Element firstchild a is :"+a.firstElementChild)



let a=document.getElementsByClassName("card-title")[0]
    a.style.color="red";

  let b=  document.getElementById("firstCardTitle")

  b.style.color="blue";


 let title= document.querySelectorAll(".card-title")
 console.log(title)
 title[0].style.color="red";
 title[1].style.color="green";
 title[2].style.color="orange";


//  let q=document.querySelector(".this")
//  q.style.color="green";
//  q.style.background="red"



//console.log(document.getElementsByTagName("a"))
console.log(document.querySelector(".card").getElementsByTagName("a"))    