import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestService } from 'src/app/rest/rest.service';
import { ProyectoPersona } from 'src/app/dtos/proyecto-persona';


@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})


export class PrincipalComponent implements OnInit {


  personas: ProyectoPersona[] = [];
  constructor(private service:RestService, private router:Router) { }

  ngOnInit() {
      this.service.getPersonas()
      .subscribe(data=>{
        this.personas=data;
      })
  }

  Editar(persona:ProyectoPersona):void{
    localStorage.setItem("id",persona.id?.toString()!);
    this.router.navigate(["edit"]);
  }

}
