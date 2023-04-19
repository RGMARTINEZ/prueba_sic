import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TRAMITES RAFAEL GUZMAN';

  constructor(private router:Router){}

  goCrearPersona(){
    this.router.navigate(["crear-persona"])
  }

  goCrearTramite(){
    this.router.navigate(["crear-tramite"])
  }


  goListadoPersonas(){
    this.router.navigate(["listado-personas"])
  }


  goListadoTramites(){
    this.router.navigate(["listado-tramites"])
  }


  goListadoUsuarios(){
    this.router.navigate(["listado-usuarios"])
  }



}
