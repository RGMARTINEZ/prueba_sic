import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProyectoTramite } from 'src/app/dtos/proyecto-tramite';
import { RestService } from 'src/app/rest/rest.service';

@Component({
  selector: 'app-listado-tramites',
  templateUrl: './listado-tramites.component.html',
  styleUrls: []
})
export class ListadoTramitesComponent implements OnInit {

  tramitesDto: ProyectoTramite[] = [];
  constructor(private service:RestService, private router:Router) {}

  ngOnInit(): void {
    // eslint-disable-next-line no-console
    console.log('obj de reparto novedad');
      this.service.getTramitesDTO()
      .subscribe(data=>{
        this.tramitesDto=data;
      })
  }

}
