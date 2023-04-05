"use strict";
// enum declared the specific number wise like("admin 1",manager 2)
var Role;
(function (Role) {
    Role[Role["ADMIN"] = 0] = "ADMIN";
    Role[Role["MANAGER"] = 1] = "MANAGER";
    Role[Role["READ_ONLY_USER"] = 2] = "READ_ONLY_USER";
})(Role || (Role = {}));
console.warn(Role);
