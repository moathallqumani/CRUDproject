import { Component } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent {

  constructor(private http:HttpClient, private toast:ToastrService){

  }

  empName = '';
  baseURL: string = "http://localhost:8080/crud";
  delete(){

    const headers = { 'content-type': 'application/json'};
    this.http
    .post(this.baseURL +"/delete",{employee_Name:this.empName},{'headers':headers})
    .subscribe((Response:any) =>{
      console.log(Response)
      if(Response.responseCode =='10'){

      }
    },Error =>{console.log(Error)})

  }
}
