import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { ContactComponent } from './component/contact/contact.component';
import { NewsfeedComponent } from './component/userhome/newsfeed/newsfeed.component';
import { NewsfeedFriendsComponent } from './component/userhome/newsfeed-friends/newsfeed-friends.component';
import { NewsfeedImagesComponent } from './component/userhome/newsfeed-images/newsfeed-images.component';
import { TimelineComponent } from './component/time-lines/timeline/timeline.component';
import { TimelineAboutComponent } from './component/time-lines/timeline-about/timeline-about.component';
import { TimelineAlbumComponent } from './component/time-lines/timeline-album/timeline-album.component';
import { TimelineFriendsComponent } from './component/time-lines/timeline-friends/timeline-friends.component';
import { SignUpComponent } from './component/sign-up/sign-up.component';
import { BarRightComponent } from './component/userhome/bar-right/bar-right.component';
import { BarTopComponent } from './component/userhome/bar-top/bar-top.component';
import { BarLeftComponent } from './component/userhome/bar-left/bar-left.component';
import { TimeBarTopComponent } from './component/time-lines/time-bar-top/time-bar-top.component';
import { TimeBarRightComponent } from './component/time-lines/time-bar-right/time-bar-right.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ContactComponent,
    NewsfeedComponent,
    NewsfeedFriendsComponent,
    NewsfeedImagesComponent,
    TimelineComponent,
    TimelineAboutComponent,
    TimelineAlbumComponent,
    TimelineFriendsComponent,
    SignUpComponent,

    BarRightComponent,
    BarTopComponent,
    BarLeftComponent,

    TimeBarTopComponent,
    TimeBarRightComponent,
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
