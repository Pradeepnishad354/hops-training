var role = ['admin', 'manager', 12];
console.warn(role);
var role1 = ['admin', 'manager'];
console.warn(role1);
//tuple for specific type 
var role2 = ['admin', 'manager', 2, 3];
role2.push(true);
role2[1] = "user";
console.warn(role2);
