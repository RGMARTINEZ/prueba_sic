import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearComponent } from './personas/crear/crear.component';
import { ActualizarComponent } from './personas/actualizar/actualizar.component';
import { PrincipalComponent } from './personas/principal/principal.component';
import { CrearTramitesComponent } from './Tramites/crear-tramites/crear-tramites.component';
import { ListadoTramitesComponent } from './Tramites/listar-tramites/listado-tramites.component';
import { ListadoUsuariosComponent } from "./usuarios/listado-usuarios.component";

const routes: Routes = [

  {path:'listado-personas',component: PrincipalComponent},
  {path:'listado-tramites', component: ListadoTramitesComponent},
  {path:'listado-usuarios', component: ListadoUsuariosComponent},
  {path:'crear-persona', component: CrearComponent},
  {path:'actualizar-persona', component: ActualizarComponent},
  {path:'crear-tramite', component: CrearTramitesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
