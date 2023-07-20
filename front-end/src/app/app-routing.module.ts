import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './component/contact/contact.component';
import { NewsfeedComponent } from './component/userhome/newsfeed/newsfeed.component';
import { NewsfeedFriendsComponent } from './component/userhome/newsfeed-friends/newsfeed-friends.component';
import { NewsfeedImagesComponent } from './component/userhome/newsfeed-images/newsfeed-images.component';
import { TimelineComponent } from './component/time-lines/timeline/timeline.component';
import { TimelineAboutComponent } from './component/time-lines/timeline-about/timeline-about.component';
import { TimelineAlbumComponent } from './component/time-lines/timeline-album/timeline-album.component';
import { TimelineFriendsComponent } from './component/time-lines/timeline-friends/timeline-friends.component';
import { SignUpComponent } from './component/sign-up/sign-up.component';

const routes: Routes = [
  { path: 'contact', component: ContactComponent },
  { path: 'newsfeed', component: NewsfeedComponent },
  { path: 'newsfeed-friends', component: NewsfeedFriendsComponent },
  { path: 'newsfeed-images', component: NewsfeedImagesComponent },
  { path: 'timeline', component: TimelineComponent },
  { path: 'timeline-about', component: TimelineAboutComponent },
  { path: 'timeline-album', component: TimelineAlbumComponent },
  { path: 'timeline-friends', component: TimelineFriendsComponent },
  { path: '**', component: NewsfeedComponent },
  { path: '', component: NewsfeedComponent },
  { path: 'sign-up', component: SignUpComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
