var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var CreateAccount = /** @class */ (function () {
    function CreateAccount() {
    }
    CreateAccount.prototype.addEmail = function (email) {
        return "".concat(email, " is added ");
    };
    return CreateAccount;
}());
var c1 = new CreateAccount();
console.log(c1.addEmail("pradeep@Gmail.com"));
var User = /** @class */ (function (_super) {
    __extends(User, _super);
    function User() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    User.prototype.addUser = function (user) {
        return "".concat(user, " added as an user");
    };
    return User;
}(CreateAccount));
var u1 = new User();
console.log(u1.addUser("pradeep"));
console.log(u1.addEmail("pradep@gmail.com"));
