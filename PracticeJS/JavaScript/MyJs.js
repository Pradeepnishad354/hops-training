
// validate code 

// return true-if form is valid 

// return false-if form is not valid


function validate(){

 let f=false;

// name field

let name=$(".name-field").val()


if(name==undefined || name==''){

 $(".name-field-msg")
 .html("name is required !!")
 .addClass("text-danger");

 return f;


}else{

    $(".name-field-msg")
     .html("ok!")
     .removeClass("text-danger")
     .addClass("text-success")
     
     f=true;

}


// password field

let password= $(".password-field").val()
let exp=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
if(password==undefined || password==''){
    $(".password-field-msg")
    .html("password is required !!")
    .addClass("text-danger")

     f=false;

}else if(exp.test(password)==false){

$(".password-field-msg")
.html("Input Password and Submit [6 to 20 characters which contain at least one numeric digit, one uppercase and one lowercase letter")
.addClass("text-danger")

 f=false;
}else{

$(".password-field-msg")
.html("ok!")
.removeClass("text-danger")
.addClass("text-success")

f=true;

}

// email-field validation

let e = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;


let email=$(".email-field").val()
if(email=='' || email==undefined){
$(".email-field-msg")
.html("email is required !!")
.addClass("text-danger")
f=false;

}
else if (e.test(email)==false){

    $(".email-field-msg")
    .html("Invalid Email ,email must contain @,.(example@gmail.com)")
     .addClass("text-danger")
}else{

$(".email-field-msg")
.html("ok!")
.removeClass("text-danger")
.addClass("text-success")

f=true;

}

// phone field validation

let phone=$(".phone-field").val()
let p=/^\d{10}$/;
if(phone==''|| phone== undefined){

    $(".phone-field-msg")
    .html("phone filed is required")
    .addClass("text-danger");
 f=false;

}else if(p.test(phone)==false){

    $(".phone-field-msg")
    .html("please enter phone number 10 digit")
    .addClass("text-danger")
 f=false;



}


else{
$(".phone-field-msg")
.html("ok!!")
.removeClass("text-danger")
.addClass("text-success")
f=true;

}


return f;


}