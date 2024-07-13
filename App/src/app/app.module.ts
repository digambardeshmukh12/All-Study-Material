import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyNewComponent } from './my-new/my-new.component';
import { ParenttochildComponent } from './parenttochild/parenttochild.component';
import { ChildtoparentComponent } from './childtoparent/childtoparent.component';
import { ProfileDetailsComponent } from './profile-details/profile-details.component';
import { ProfiledetailsngmodelComponent } from './profiledetailsngmodel/profiledetailsngmodel.component';
import{FormsModule} from '@angular/forms';
import { DirectivesComponent } from './directives/directives.component';

@NgModule({
  declarations: [
    AppComponent,
    MyNewComponent,
    ParenttochildComponent,
    ChildtoparentComponent,
    ProfileDetailsComponent,
    ProfiledetailsngmodelComponent,
    DirectivesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
