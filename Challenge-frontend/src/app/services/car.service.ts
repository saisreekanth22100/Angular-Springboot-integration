import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Car } from '../common/car';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CarService {
  private baseUrl = 'http://localhost:8081/challenge/cars';

  constructor(private httpClient: HttpClient) { }

  getCarList(): Observable<Car[]> {
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(map(response => response._embedded.cars));
  }
}

interface GetResponse {
  _embedded: {
    cars: Car[];
  }
}
