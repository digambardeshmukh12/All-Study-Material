import { Component } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent {

profile={
  name:'SWATI',
  email:'swati@gmail.com'
};

Girls=[{name:'swati',surname:'H'},
      {name:'Rutuja',surname:'P'}
    ];

isSpecial:boolean=true;

}
