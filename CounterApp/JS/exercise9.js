

 // 1. loadscript using promises && async function ,await 
let loadScript = async (src) => {

    return new Promise((resolve, reject) => {
        let script = document.createElement("script")

        script.src = src;

script.onload=()=>{

    resolve(src);

}
document.head.append(script)

    })

}
//1.using same thing by then function

//     let a=loadScript("https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js")
// a.then((value)=>{

//     console.log(a)
// })



// 2.async
// const main3=async ()=>{

//     let a=await loadScript("https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js")

// console.log(a)
// }
// main3()

//3. problem


let p=()=>{

    return new Promise((resolve,reject)=>{

    
    setTimeout(()=>{

        reject(new Error("this is error"))


    })
})
}

let a=async ()=>{

    try{
    let c=await p()
    console.log(c)
    }catch(error){

        console.log("error handled")
    }
}
a()