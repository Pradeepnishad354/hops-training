interface userType{
name:string,
age:number

getName:()=>string
}

let users:userType={
name:'pradeep',
age:20,
getName:function(){

    return "amit";

}
}

console.log(users)
console.log(users.getName())