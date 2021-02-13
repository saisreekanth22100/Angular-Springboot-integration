import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarListComponent } from './car-list/car-list.component';
import { ViewCarComponent } from './view-car/view-car.component';
import { HttpClientModule } from '@angular/common/http';
import { CarService } from './services/car.service';

@NgModule({
  declarations: [
    AppComponent,
    CarListComponent,
    ViewCarComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [CarService],
  bootstrap: [AppComponent]
})
export class AppModule { }
