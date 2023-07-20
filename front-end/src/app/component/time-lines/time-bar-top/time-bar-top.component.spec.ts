import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeBarTopComponent } from './time-bar-top.component';

describe('TimeBarTopComponent', () => {
  let component: TimeBarTopComponent;
  let fixture: ComponentFixture<TimeBarTopComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TimeBarTopComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TimeBarTopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
