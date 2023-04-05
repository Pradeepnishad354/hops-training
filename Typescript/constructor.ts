class User{

name="";
age="";
email="";


constructor( name, age, email){


    this.name=name;
    this.age=age;
    this.email=email;

}   

// constructor(public name,public age,public email){

// }


displayVal(){

    console.log(this.name,this.age,this.email)
}


}

const u1=new User('pradeep',22,'pradeep@gmail.com');
u1.displayVal();