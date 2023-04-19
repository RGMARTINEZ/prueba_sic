import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProyectoPersona } from 'src/app/dtos/proyecto-persona';
import { RestService } from 'src/app/rest/rest.service';

@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.css']
})
export class CrearComponent implements OnInit {

  itemPersona: ProyectoPersona = new ProyectoPersona();
  constructor(private router:Router, private service:RestService) {}

  ngOnInit(){
    
  }

  Guardar(identificacion: number, nombres: String, apellidos: String){ 
   
    this.itemPersona.nombres = nombres;
    this.itemPersona.apellidos = apellidos;
    this.itemPersona.telefono = '';
    this.itemPersona.tipoIdentificacion = '';
    this.itemPersona.numeroIdentificacion = identificacion ;
    this.itemPersona.email = '';
    this.itemPersona.direccion = '';
    
    this.service.crearPersona(this.itemPersona)
    .subscribe(data=>{
      alert("Se ingreso correctamente..");
      this.router.navigate(["listado-personas"]);
    })
  }

}
