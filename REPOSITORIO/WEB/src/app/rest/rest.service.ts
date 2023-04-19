import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { ProyectoPersona } from '../dtos/proyecto-persona';
import { ProyectoTramite } from '../dtos/proyecto-tramite';

@Injectable({
  providedIn: 'root'
})

export class RestService {
  
  constructor(private http:HttpClient) { }

  endPointPersonas='http://localhost:8080/api/personas';
  
  endPointTramites='http://localhost:8080/api/tramites';

  endPointUsuarios='https://gorest.co.in/public/v1/users/';



  crearPersona(persona:ProyectoPersona){
    return this.http.post<ProyectoPersona>(this.endPointPersonas,persona)
  }

  crearTramite(persona:ProyectoTramite){
    return this.http.post<ProyectoTramite>(this.endPointTramites,persona)
  }

  editarPersona(persona:ProyectoPersona){
    return this.http.put<ProyectoPersona>(this.endPointPersonas+"/"+persona.id,persona);
  }


  getPersonaId(id:number){
    return this.http.get<ProyectoPersona>(this.endPointPersonas+"/"+id);
  }

  getPersonas(){
    return this.http.get<ProyectoPersona[]>(this.endPointPersonas);
  }

  getTramitesDTO(){
    return this.http.get<ProyectoTramite[]>(this.endPointTramites);
  }

  getUsuariosDTO(){
    return this.http.get<any[]>(this.endPointUsuarios);
  }

}
