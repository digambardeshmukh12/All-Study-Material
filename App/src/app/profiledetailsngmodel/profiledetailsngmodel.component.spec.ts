import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfiledetailsngmodelComponent } from './profiledetailsngmodel.component';

describe('ProfiledetailsngmodelComponent', () => {
  let component: ProfiledetailsngmodelComponent;
  let fixture: ComponentFixture<ProfiledetailsngmodelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfiledetailsngmodelComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfiledetailsngmodelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
