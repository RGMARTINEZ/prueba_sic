import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { PrincipalComponent } from "./personas/principal/principal.component";
import { CrearComponent } from "./personas/crear/crear.component";
import { ActualizarComponent } from "./personas/actualizar/actualizar.component";
import { FormsModule } from "@angular/forms";
import { RestService } from "./rest/rest.service";
import { HttpClientModule } from "@angular/common/http";
import { ListadoTramitesComponent } from "./Tramites/listar-tramites/listado-tramites.component";
import { CrearTramitesComponent } from "./Tramites/crear-tramites/crear-tramites.component";
import { ListadoUsuariosComponent } from "./usuarios/listado-usuarios.component";


@NgModule({
  declarations: [
    AppComponent,
    PrincipalComponent,
    CrearComponent,
    ActualizarComponent,
    ListadoTramitesComponent,
    CrearTramitesComponent,
    ListadoUsuariosComponent
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule],
  providers: [RestService],
  bootstrap: [AppComponent],
})
export class AppModule {}