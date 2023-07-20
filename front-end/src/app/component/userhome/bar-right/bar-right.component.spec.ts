import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BarRightComponent } from './bar-right.component';

describe('BarRightComponent', () => {
  let component: BarRightComponent;
  let fixture: ComponentFixture<BarRightComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BarRightComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BarRightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
