
//show item
 function readItem(){

let list= document.getElementById("list")
let listItem= list.getElementsByTagName("li")
console.log(listItem)


}

// create item


    function createItem() {
        var list = document.getElementById('list');
        var newItem = document.createElement('li');
        newItem.innerHTML = 'New Item';
        list.appendChild(newItem);
      }



// update item

function updateItem(){

let list=document.getElementById('list')
let items=list.getElementsByTagName('li')
if(items.length>0){

    items[0].innerHTML='Update Item'

   
}




}

//delete item

function deleteItem(){

let list=document.getElementById("list")
let items=list.getElementsByTagName("li")

if(items.length>0){

    list.removeChild(items[0])
}

}



//


