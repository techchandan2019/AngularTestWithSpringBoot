import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from './student';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {

  baseURL="http://localhost:4042/studentapi"
  constructor(private httpClient:HttpClient) { }

  addStudent(student:Student):Observable<Object> {
    // console.log(student);
    return this.httpClient.post(`${this.baseURL}/save`,student);
  }
  getStduentList():Observable<Student[]> {
    // console.log(student);
    // return this.httpClient.post(`${this.baseURL}/save`,student);
    return this.httpClient.get<Student[]>(`${this.baseURL}/getAll`);
  }
}
