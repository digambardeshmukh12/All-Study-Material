import { Component } from '@angular/core';

@Component({
  selector: 'app-profiledetailsngmodel',
  templateUrl: './profiledetailsngmodel.component.html',
  styleUrls: ['./profiledetailsngmodel.component.css']
})
export class ProfiledetailsngmodelComponent {
profile={name:'',address:'',email:'',contact:''};
printDetails(profile:any){

  alert(profile.name + "\n" + profile.address + "\n" +
   profile.email + "\n" + profile.contact);

}

}
