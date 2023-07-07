document.cookie="name=pradeep12345"

document.cookie="name=pradeep123456"

document.cookie="name=pradeep1234567"

document.cookie="name=amit23456"





let key=prompt("enter key")

let value=prompt("enter value")

document.cookie=`${encodeURIComponent(key)}=${encodeURIComponent(value)}`

console.log(document.cookie)