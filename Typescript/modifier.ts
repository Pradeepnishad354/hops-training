class Users{
private name="";

setName(name){

    this.name=name;

}
displayName(){

    console.log(this.name);
}
getNameLength(){

    console.log(this.name.length);
}


}

const u1=new Users;
u1.setName("pradeep");
//u1.name="amit";
u1.displayName();
u1.getNameLength();