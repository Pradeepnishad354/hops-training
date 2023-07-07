
// error handling 

/*setTimeout(()=>{

console.log("hacking your wifi ..")


},1000)

try{
    console.log(pradeep)

}catch(error){
    console.log(error)
}


setTimeout(()=>{

    console.log("fetching your username and password please wait..")
    
    try{
    console.log(ashu)
    }catch(error){
        console.log(error)
    }
    },2000)

    setTimeout(()=>{

        console.log("fethed your password  ..")
        
        
        },3000)

*/

        // custom error through

        // try{

        //     console.log(pritesh);
        //     throw new ReferenceError("not good")
        // }catch(error){

        //     console.log(error.name)
        //     console.log(error.message)
        //     console.log(error.stack)
        // }


        try{

let age =prompt("enter the age")

 age=Number.parseInt(age)

 if(age<18){
    throw new ReferenceError("you are not eleigible for voting")
 }else{

    console.log("you are eligible for voting    ")
 }

        }catch(error){


            console.log(error.message)
            console.log(error.name)
            console.log(error.stack)
        }

finally{

    console.log("finally block running")
}
