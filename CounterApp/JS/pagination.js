

var itemsPerPage = 8; // Number of items to display per page
var currentPage = 1; // Current page

var items = [
  "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", 
  "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", 
  "Item 11", "Item 12", "Item 13", "Item 14", "Item 15",
  "Item 16", "Item 17", "Item 18", "Item 19", "Item 20",
  "Item 21", "Item 22", "Item 23", "Item 24", "Item 25"
]; // Sample data




var container = document.getElementById('list');
    var paginationContainer = document.querySelector('.pagination');
    
    function displayItems() {
      var startIndex = (currentPage - 1) * itemsPerPage;
      var endIndex = startIndex + itemsPerPage;
      
      container.innerHTML = '';
      
      for (var i = startIndex; i < endIndex && i < items.length; i++) {
        var item = items[i];
        var li = document.createElement('li');
        li.textContent = item;
        container.appendChild(li);
      }
    }
    

function createPagination() {
    var totalPages = Math.ceil(items.length / itemsPerPage);
    
    paginationContainer.innerHTML = '';
    
    for (var i = 1; i <= totalPages; i++) {
      var button = document.createElement('button');
      button.textContent = i;
      
      if (i === currentPage) {
        button.classList.add('active');
      }
      
      button.addEventListener('click', function() {
        currentPage = parseInt(this.textContent);
        displayItems();
        createPagination();
      });
      
      paginationContainer.appendChild(button);
    }
  }
  
  
  displayItems();
  createPagination();
   