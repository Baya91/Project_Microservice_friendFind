import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeBarRightComponent } from './time-bar-right.component';

describe('TimeBarRightComponent', () => {
  let component: TimeBarRightComponent;
  let fixture: ComponentFixture<TimeBarRightComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TimeBarRightComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TimeBarRightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
