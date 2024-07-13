import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'App';

  stdarr = [
            {rno:1 , name : 'Priya' ,grade : 'A'},
            {rno:2 , name : 'sonali' ,grade : 'A'},
            {rno:3 , name : 'swati' ,grade : 'F'}

    ];

  chatItems:Array<string>=[];
  talkBack(e:string){
    this.chatItems.push(e);
  }
}
