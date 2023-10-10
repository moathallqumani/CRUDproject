import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Employee } from '../Entity/Employee';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent {


  baseURL: string = "http://localhost:8080/crud/create";

  constructor(private http: HttpClient) {
  }


  empName = '';
  empSalary = '';
  empAge = '';
  empRole = '';
  insert() {
    const headers = { 'content-type': 'application/json'};


    this.http
    .post(this.baseURL,{employee_Name:this.empName,employee_Salary:this.empSalary,employee_Age:this.empAge,employee_Role:this.empRole},{'headers':headers})
    .subscribe((Response) =>{
      console.log(Response)
    },Error =>{console.log(Error)})


  }




}
