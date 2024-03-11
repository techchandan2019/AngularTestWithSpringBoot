import { Component, OnInit } from '@angular/core';
import { StudentServiceService } from '../student-service.service';
import { Student } from '../student';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  studentList:Student[] =[];
  constructor(private service:StudentServiceService) { }

  ngOnInit(): void {
    this.service.getStduentList().subscribe(p=>{
      console.log(p);
      this.studentList=p});
  }

}
