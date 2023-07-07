
// function  myDisplay(some){

// document.getElementById("demo").innerHTML=some;


// }

// async function myFunction(){

//     return "hello";
// }

// myFunction().then(  

//     function(value){

//         myDisplay(value)
//     },

//     function(error){
// myDisplay(error)
//     }

// )



async function myFunction(){

    let promise=new Promise(function(resolve,reject){

      setTimeout (function(){

        resolve("har har mahadev")
      },3000    )  
    })

    document.getElementById("demo").innerHTML=await promise;
}

myFunction()
console.log(promise)

