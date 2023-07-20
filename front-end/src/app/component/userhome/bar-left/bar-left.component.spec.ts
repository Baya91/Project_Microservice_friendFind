import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BarLeftComponent } from './bar-left.component';

describe('BarLeftComponent', () => {
  let component: BarLeftComponent;
  let fixture: ComponentFixture<BarLeftComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BarLeftComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BarLeftComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
