import { Component } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';

import { Employee } from '../Entity/Employee';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent {

  baseURL: string = "http://localhost:8080/crud";

  constructor(private http: HttpClient) {
  }
  employee = {};
  searchInput = '';
  empName = '';
  empSalary = '';
  empAge = '';
  empRole = '';
  update() {
    const headers = { 'content-type': 'application/json'};


    this.http
    .post(this.baseURL +"/update",{employee_Name:this.empName,employee_Salary:this.empSalary,employee_Age:this.empAge,employee_Role:this.empRole},{'headers':headers})
    .subscribe((Response) =>{
      console.log(Response)
    },Error =>{console.log(Error)})


  }


  search() {
    const headers = { 'content-type': 'application/json'};

    console.log(this.empName)
    this.http
    .get(this.baseURL+"/search?empName="+this.searchInput,{'headers':headers})
    .subscribe((Response) =>{
     this.employee = Response;
     console.log(this.employee)

    })


  }

}
