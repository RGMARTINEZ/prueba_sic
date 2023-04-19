import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProyectoTramite } from 'src/app/dtos/proyecto-tramite';
import { RestService } from 'src/app/rest/rest.service';

@Component({
  selector: 'app-listado-usuarios',
  templateUrl: './listado-usuarios.component.html',
  styleUrls: []
})
export class ListadoUsuariosComponent implements OnInit {

  usuariosDto: any[] = [];
  constructor(private service:RestService, private router:Router) {}

  ngOnInit(): void {
      this.service.getUsuariosDTO()
      .subscribe( data => {

        let tempData: any = data;
        this.usuariosDto=tempData.data;
      })
  }

}
