

// // fetch Api get
// let p=fetch("https://goweather.herokuapp.com/weather/Ny")

// p.then((response)=>{

//     console.log(response.status)
//     console.log(response.ok)
//     console.log(response.headers)
//     //console.log(response.text())
// return response.json()

// }).then((v)=>{


//    console.log(v) 
// })


let createToDo =async()=>{

let options={

method:"POST",
headers:{
        "Content-type":"application/json"
},

body:JSON.stringify({

    title:'pradeep',
    body:'nothing',
    userId:11
}),


}


let p=await fetch('https://jsonplaceholder.typicode.com/posts',options)

let response=await p.json()
return response;

}
//get data

const getToDo=async (id)=>{

   let response= await fetch('https://jsonplaceholder.typicode.com/posts/'+id)

let r=await response.json()
return r;
}






const mainFun= async()=>{
// let todo={
//     title:'pradeep',
//     body:'nothing',
//     userId:11
// }


let todo1= await createToDo();
console.log(todo1)
console.log(await getToDo(11))

}

mainFun()











// fetch('https://jsonplaceholder.typicode.com/posts',options)
// .then((response)=>response.json())
// .then((value)=>console.log(value))