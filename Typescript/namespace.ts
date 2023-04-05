namespace UserUtils
{


  export  class Users extends Parent{

        getName(){

            return "pradeep"
        }
    }
}

let u1=new UserUtils.Users();
u1.setName("amit");
console.log(u1.getName())