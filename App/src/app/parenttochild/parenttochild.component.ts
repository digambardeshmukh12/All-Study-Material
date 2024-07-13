import { Component,Input,OnInit } from '@angular/core';

@Component({
  selector: 'app-parenttochild',
  templateUrl: './parenttochild.component.html',
  styleUrls: ['./parenttochild.component.css']
})
export class ParenttochildComponent {

  @Input('data')stdarr:any;
  @Input('title')title:any;
}
