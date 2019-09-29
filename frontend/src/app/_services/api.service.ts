import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import {Observable} from 'rxjs';


@Injectable()
export class ApiService {

  constructor(private httpClient: HttpClient) {
  }

  // private static _handleError(err: HttpErrorResponse | any) {
  //   return Observable.throw(err.message || 'Error: Unable to complete request.');
  // }

  // getUsers(): Observable<User[]> {
  //   return this.httpClient
  //     .get<User[]>(`${API_URL}/accounts`)
  //
  // }
  //
  // loginUser(user: User) {
  //   return this.httpClient.post('${API_URL}/accounts/login', user);
  // }
  //
  // register(user: User) {
  //   return this.httpClient.post('${API_URL}/accounts/registration', user);
  // }

  // getStation(): Observable<any[]> {
  //   return this.httpClient.get<any[]>('http://localhost:8080/ttf/cxf/service/findByTicket?number=002');
  // }
  //
  // getSRestaurants(): Observable<any[]> {
  //   return this.httpClient.get<any[]>('http://localhost:8080/ttf/cxf/service/restaurants?code=817875152');
  // }
  //
  // getMenues(): Observable<any[]> {
  //   return this.httpClient.get<any[]>('http://localhost:8080/ttf/cxf/service/menu?code=922460118')
  // }
}
