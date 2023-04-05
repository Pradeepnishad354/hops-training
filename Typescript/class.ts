class User{

name:"";
email:"";

//add user
addUser(user){

    return `${user} is added`
}

// remove user 
removeUser(user){

    console.log(`${user} removed`)

}


}
let User1=new User;
let result=User1.addUser("amit");
User1.removeUser("pradeep")
console.log(result)
