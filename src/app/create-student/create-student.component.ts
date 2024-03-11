import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentServiceService } from '../student-service.service';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  student:Student=new Student();
  constructor(private service:StudentServiceService) { }

  ngOnInit(): void {
  }
  addStudentData(){
    this.service.addStudent(this.student).subscribe(val=>console.log(val),error=>console.log(error));
  }

}
