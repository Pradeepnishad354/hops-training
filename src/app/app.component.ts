import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  constructor(){
console.warn("constructor called")

  }
  ngOnInit(): void {
   console.warn("onInit called")

  }

  title = 'Angular 15';
  getData(a: number, b: number) {


    return a + b;
  }

  data() {

    return 10 + 14;
  }



  getName(){

    alert("hello pradeep")
  }

  getParam(name:string,secondName:string){

    alert(name+secondName)


  }

  getValue(value:string){
 console.log(value)
 this.display=value

  }

  display:string=''


  // counter example


  count=0;
  counter(type:string){

type==='add' ?this.count++:this.count--;

  }
  

// property binding 

name="pradeep"

disable="true"
//if else 
// show=false
show='yes'

//color='red'
//color='orange'
color='green'





title1:string="Learn pipes Step By Step"

today=Date();





// manually
capString(item:string){

  return item.toUpperCase();
}

//advance learn about pipe

user={
  name:'pradeep',
  age:22
}


// onchange hook

d="hello"

updateData(){

  this.d="hi..."
}

//switch case
switch='Switch Case'
color2='blue'

// for loops 

users=['amit','henil','roshan','asif','vinayak']

userDetails=[{name:'pradeep',email:'pradeep@gmail.com',mob:'99181873'},

{name:'amit',email:'amit@gmail.com',mob:'9918184573'},
{name:'roshan',email:'roshan@gmail.com',mob:'9954181873'},
]

// nestedForloop

user1=[{ name:'pradeep',email:'pradeep@gmail.com',mob:'99181873',Account:['facebook','instagram','whatsapp']},

{name:'amit',email:'amit@gmail.com',mob:'9918184573',Account:['facebook','instagram','whatsapp']},
{name:'roshan',email:'roshan@gmail.com',mob:'9954181873',Account:['facebook','instagram','whatsapp']},
]



}
