import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarListComponent } from './car-list/car-list.component';
import { ViewCarComponent } from './view-car/view-car.component';
import { HttpClientModule } from '@angular/common/http';
import { CarService } from './services/car.service';
import { Routes,RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'car-details', component: ViewCarComponent },
  { path: 'cars', component: CarListComponent },
  { path: '', redirectTo: '/cars', pathMatch: 'full' },
  { path: '**', redirectTo: '/cars', pathMatch: 'full' }
];

@NgModule({
  declarations: [
    AppComponent,
    CarListComponent,
    ViewCarComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [CarService],
  bootstrap: [AppComponent]
})
export class AppModule { }
