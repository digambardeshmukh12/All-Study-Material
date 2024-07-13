import { Component,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-childtoparent',
  templateUrl: './childtoparent.component.html',
  styleUrls: ['./childtoparent.component.css']
})
export class ChildtoparentComponent {

  @Output()talk:EventEmitter<string>=new EventEmitter<string>();
  talkBack(say:string)
  {
    this.talk.emit(say);
  }
}
