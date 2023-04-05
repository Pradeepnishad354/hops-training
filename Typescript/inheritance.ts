class CreateAccount{

addEmail(email){

return `${email} is added `

}

}

const c1=new CreateAccount();
console.log(c1.addEmail("pradeep@Gmail.com"))


//inheritance example 
class User extends CreateAccount{


addUser(user){

    return `${user} added as an user`
}

}

const u1=new User();
console.log(u1.addUser("pradeep"));
console.log(u1.addEmail("pradep@gmail.com"))