var User = /** @class */ (function () {
    function User(name, age, email) {
        this.name = "";
        this.age = "";
        this.email = "";
        this.name = name;
        this.age = age;
        this.email = email;
    }
    User.prototype.displayVal = function () {
        console.log(this.name, this.age, this.email);
    };
    return User;
}());
var u1 = new User('pradeep', 22, 'pradeep@gmail.com');
u1.displayVal();
