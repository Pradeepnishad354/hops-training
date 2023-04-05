var Users = /** @class */ (function () {
    function Users() {
        this.name = "";
    }
    Users.prototype.setName = function (name) {
        this.name = name;
    };
    Users.prototype.displayName = function () {
        console.log(this.name);
    };
    Users.prototype.getNameLength = function () {
        console.log(this.name.length);
    };
    return Users;
}());
var u1 = new Users;
u1.setName("pradeep");
//u1.name="amit";
u1.displayName();
u1.getNameLength();
