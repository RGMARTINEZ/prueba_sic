import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ProyectoTramite } from 'src/app/dtos/proyecto-tramite';
import { RestService } from 'src/app/rest/rest.service';

@Component({
  selector: 'app-crear-tramites',
  templateUrl: './crear-tramites.component.html',
  styleUrls: ['./crear-tramites.component.css']
})
export class CrearTramitesComponent {
  itemTramite: ProyectoTramite = new ProyectoTramite();

  constructor(private router:Router, private service:RestService) {}

  Guardar(anio: String, identificacion: String,  nombres: String, descripcion: String, ){ 
   
    this.itemTramite.anioRadicacion = anio;
    this.itemTramite.numeroRadicado = identificacion;
    this.itemTramite.nombre = nombres;
    this.itemTramite.descripcion = descripcion;
    this.itemTramite.idFuncionarioRecibio = '1' ;
    this.itemTramite.idPersonaRadico = '1';

    
    this.service.crearTramite(this.itemTramite)
    .subscribe(data=>{
      alert("Se ingreso correctamente..");
      this.router.navigate(["listado-tramites"]);
    })
  }
}
