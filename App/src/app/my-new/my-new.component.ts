import { Component } from '@angular/core';

@Component({
  selector: 'app-my-new',
  templateUrl: './my-new.component.html',
  styleUrls: ['./my-new.component.css']
})
export class MyNewComponent {

  people = [
        {name : 'Raj' , country : 'UK'},
        {name : 'Sam' , country : 'USA'},
        {name : 'Jack' , country : 'HK'}

    ];

  public hasError = true ;

  profile={name:'SWATI',email:'swati@gmail.com'};

}
