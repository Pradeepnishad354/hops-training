
// let counter=0;


// let countValue=document.getElementById("counter-value")
// let increment=document.getElementById("increment-btn")

// let decrement=document.getElementById("decrement-btn")

// let resett=document.querySelector("#reset-btn")


// // increment the count

// increment.addEventListener('click',()=>{

// counter++;

// countValue.innerHTML= counter;


// })

// // decrement count

//  decrement.addEventListener('click',()=>{

//     counter--;

//     countValue.innerHTML=counter;



//  })

//  resett.addEventListener('click',reset)
//  function reset(){

//     counter=0; 
//     countValue.innerHTML=counter;
//  }
    



let counterDisplay = document.getElementById('counter');

// Initial counter value
let counter = 0;

// Function to increment the counter
function incrementCounter() {
  counter++;
  counterDisplay.textContent = counter;
}

// Function to decrement the counter
function decrementCounter() {
//   if (counter > 0) {
    counter--;
    counterDisplay.textContent = counter;
  }
//}

function resetCounter(){

    counter=0;
    counterDisplay.textContent=counter;
}



// Attach event listeners to buttons
let  incrementButton = document.getElementById('incrementButton');
incrementButton.addEventListener('click', incrementCounter);

let  decrementButton = document.getElementById('decrementButton');
decrementButton.addEventListener('click', decrementCounter);

let resetButton=document.getElementById("reset-btn");

resetButton.addEventListener('click',resetCounter)




