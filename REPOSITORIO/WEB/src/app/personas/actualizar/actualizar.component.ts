import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestService } from 'src/app/rest/rest.service';
import { ProyectoPersona } from 'src/app/dtos/proyecto-persona';


@Component({
  selector: 'app-actualizar',
  templateUrl: './actualizar.component.html',
  styleUrls: ['./actualizar.component.css']
})


export class ActualizarComponent implements OnInit {

  persona:  ProyectoPersona=new ProyectoPersona();
  constructor(private router:Router, private service:RestService){}
    
  ngOnInit() {
      this.Editar();

    }

    Editar(){
      let id=localStorage.getItem("id");
      this.service.getPersonaId(+id!)
      .subscribe(data=>{
        this.persona=data;
      })
    }

    Actualizar(){
      this.service.editarPersona(this.persona)
      .subscribe(data=>{
        this.persona=data;
        alert("Se actualizó exitosamente...")
        this.router.navigate(["listado-personas"]);
      })
    }


  }


