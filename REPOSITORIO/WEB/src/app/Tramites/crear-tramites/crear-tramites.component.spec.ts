import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddTramitesComponent } from './crear-tramites.component';

describe('AddTramitesComponent', () => {
  let component: AddTramitesComponent;
  let fixture: ComponentFixture<AddTramitesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddTramitesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddTramitesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
