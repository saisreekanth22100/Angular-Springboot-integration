import { Component, OnInit } from '@angular/core';
import { Car } from 'src/app/common/car';
import { CarService } from 'src/app/services/car.service';

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class CarListComponent implements OnInit {


  cars: Car[] = [];
  constructor(private carService: CarService) { }

  ngOnInit() {
    this.listBooks();
  }

  listBooks() {
    this.carService.getCarList().subscribe(
      data => {
        this.cars = data;
      }
    )
  }


 
}
