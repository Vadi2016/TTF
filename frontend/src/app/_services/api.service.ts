import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import {Observable} from 'rxjs';
import {User} from '../_models';


@Injectable()
export class UserApiService {

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
}
