let role=['admin','manager',12]

console.warn(role)

let role1:(string[]|number[])=['admin','manager']

console.warn(role1)

//tuple for specific type 
let role2:[string,string,number,number,boolean ?]=['admin','manager',2,3]

role2.push(true);
role2[1]="user";
console.warn(role2)