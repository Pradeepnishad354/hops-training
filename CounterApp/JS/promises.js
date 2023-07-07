/*let p1=new Promise((resolve,reject)=>{
console.log("promise is pending")

setTimeout(()=>{
console.log("I am promise and I am resolve")
resolve(true)

},3000)
});


let p2=new Promise((resolve,reject)=>{
console.log("promise is pending")

setTimeout(()=>{
console.log("I am Promises and I am rejected")

reject(new Error("I am error"))
},3000)


})

// to get the value
p1.then((value)=>{

    console.log(value)
})

//To catch the error
p2.catch((error)=>{

    console.log("some error occured")
})

// both error and value

// p2.then((value)=>{

// console.log(value)

// },(error)=>{    

//     console.log(error)
// })







// example of promises
let p3=new Promise(resolve=>{

    setTimeout(()=>{
resolve("done")

    },2000)



})

p3.then(alert)


*/




// promise chaining().then


/*
let p1=new Promise((resolve,reject)=>{


    setTimeout(()=>{
        console.log("resolve after 2 sec")
        resolve(30)

    },2000)

    

})
p1.then((value)=>{
console.log(value)
let p2=new Promise((resolve,reject)=>{

    setTimeout(()=>{
        resolve("Promise 2")
    })

    
})  
return p2;
}).then((value)=>{
    console.log("Done")

return 4;
}).then((value)=>{

    console.log("now we Are done")
})

*/

// write loadscript function through promises


/*const loadScript=((src)=>{

    return new Promise((resolve,reject)=>{  
  let script=  document.createElement("script")

script.type="text/javascript";
script.src=src;

script.onload=()=>{

    resolve(1)
}
script.onerror=()=>{

    reject(0)
}


})
});

let p5=loadScript("http://localhost:8888/add")

p5.then((value)=>{

    console.log(value)
})
console.log(p5) */



// attaching multiple handler method wiht promises
/*
let p1= new Promise((resolve,reject) =>{

setTimeout(()=>{

    resolve(1);

},3000)


})

p1.then(()=>{

    return new Promise((resolve,reject)=>{

        setTimeout(()=>{

            resolve(4);
        })

    })

}).then((value)=>{

    console.log(value)

})

p1.then(()=>{

    console.log("promise is now resolve")

})

p1.then(()=>{

    console.log("hurry up")

})
*/




/*
//Promise API

let p1=new Promise((resolve,reject)=>{

setTimeout(()=>{

    // resolve("value 1")

    reject(new Error('error'))

},1000)

})

let p2=new Promise((resolve,reject)=>{

setTimeout(()=>{

    resolve("value 2")
},2000)

})


let p3=new Promise((resolve,reject)=>{

    setTimeout(()=>{
    
        resolve("value 3")
    },3000)
    
    })

    
  // let promise_all=Promise.all([p1,p2,p3])

   //let promise_all=Promise.allSettled([p1,p2,p3])

  // let promise_all=Promise.race([p1,p2,p3])

   let promise_all=Promise.any([p1,p2,p3])

  // let promise_all=Promise.reject(new Error("Hey"))


   promise_all.then((value)=>{

    console.log(value)
   }) */


   // async and await function 


  


   async function fun(){
    let delhiWeather=new Promise((resolve,reject)=>{

        setTimeout(()=>{
    
            resolve("24 deg")
    
        },1000)
    })
    let mohaliWeather=new Promise((resolve,reject)=>{
    
        resolve("29 deg")
    },2000)
    
   /*    
    delhiWeather.then((value)=>{

        console.log(value)
    })

    mohaliWeather.then((v)=>{
   
        console.log(v)
         
    }) */

    console.log("fetching delhi weather please wait .....")
    let delhiW=await delhiWeather
    console.log("fetch delhi weather"+delhiW)

    console.log("fetching mohali weather please wait .......")
    let mohaliW=await  mohaliWeather
    console.log("fetch mohali  weather"+mohaliW)

    return [delhiW,mohaliW]

    } 

const m1 =async ()=>{

    console.log("hey I am m1 and I am not waiting ")

}

const main1=async ()=>{

console.log("weather control pannel")
 let a  =await m1()
   let b=await fun();

   a.then((value)=>{

    console.log(value)
   })



// a.then((value)=>{
// console.log(value)

//    })

}

main1()

 //  console.log(a)