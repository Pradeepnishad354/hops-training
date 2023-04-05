var User = /** @class */ (function () {
    function User() {
    }
    //add user
    User.prototype.addUser = function (user) {
        return "".concat(user, " is added");
    };
    // remove user 
    User.prototype.removeUser = function (user) {
        console.log("".concat(user, " removed"));
    };
    return User;
}());
var User1 = new User;
var result = User1.addUser("amit");
User1.removeUser("pradeep");
console.log(result);
