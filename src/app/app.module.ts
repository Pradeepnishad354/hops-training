import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserDataComponent } from './user-data/user-data.component';
import { StudentListComponent } from './student-list/student-list.component';
import { CountryListComponent } from './country-list/country-list.component';
import { SigninComponent } from './signin/signin.component';
import { UsdInrPipe } from './pipes/usd-inr.pipe';
import { ChildCmpComponent } from './child-cmp/child-cmp.component';
import { UserComponent } from './user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserListComponent,
    UserDataComponent,
    StudentListComponent,
    CountryListComponent,
    SigninComponent,
    UsdInrPipe,
    ChildCmpComponent,
    UserComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [UserComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
