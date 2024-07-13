import { Component } from '@angular/core';

@Component({
  selector: 'app-profile-details',
  templateUrl: './profile-details.component.html',
  styleUrls: ['./profile-details.component.css']
})
export class ProfileDetailsComponent {

show(name:any,address:any,email:any,contact:any)
{
  alert("Name : " + name + " Address :" + address +" Email" + email 
    + " Contact Numbers :"+contact);
 }
}
