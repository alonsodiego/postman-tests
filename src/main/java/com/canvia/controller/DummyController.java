package com.canvia.controller;

import com.canvia.Entity.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DummyController {

    @RequestMapping("/empleados")
    public List<Empleado> all() {

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Coraline","Jones"));
        return listaEmpleados;
    }

    @GetMapping("/beneficio/retencion/judicial/listar-retenciones")
    @ResponseBody
    public List<RetencionJudicial> todasRetJud(@RequestParam(required = false) String pagina,
                                             @RequestParam(required = false) String nombre,
                                             @RequestParam(required = false) String dni,
                                             @RequestParam(required = false) String total) {

        List<RetencionJudicial> listaRetJud = new ArrayList<>();
        listaRetJud.add(new RetencionJudicial("Coraline","Jones"));
        return listaRetJud;
    }

    @GetMapping("/beneficio/retencion/judicial/descargar-retencines-judiciales")
    @ResponseBody
    public List<RetencionJudicial> descargarRetJud(@RequestParam(required = false) String fchInicial,
                                                   @RequestParam(required = false) String fchFinal,
                                                   @RequestParam(required = false) String estado) {

        List<RetencionJudicial> listaRetJud = new ArrayList<>();
        listaRetJud.add(new RetencionJudicial("Coraline","Jones"));
        return listaRetJud;
    }

    @GetMapping("/soporte/dato-general/listar-agencias")
    @ResponseBody
    public List<Agencia> todasAgencias(@RequestParam(required = false) String pagina,
                                                 @RequestParam(required = false) String cod_agencia,
                                                 @RequestParam(required = false) String cod_sucursal,
                                                 @RequestParam(required = false) String cod_departamento,
                                                 @RequestParam(required = false) String cod_ciudad) {

        List<Agencia> listaAgencias = new ArrayList<>();
        listaAgencias.add(new Agencia("Coraline","Jones"));
        return listaAgencias;
    }

    @GetMapping("/soporte/dato-general/listar-entidades-financieras")
    @ResponseBody
    public List<EntidadFinanciera> todasEntidadesFinancieras(@RequestParam(required = false) String pagina,
                                                             @RequestParam(required = false) String cod_banco) {

        List<EntidadFinanciera> listaEntidadesFinanciera = new ArrayList<>();
        listaEntidadesFinanciera.add(new EntidadFinanciera("Coraline","Jones"));
        return listaEntidadesFinanciera;
    }

    @GetMapping("/soporte/dato-general/listar-tipo-identificacion")
    @ResponseBody
    public List<TipoIdentificacion> todosTiposIdentificacion(@RequestParam(required = false) String pagina) {

        List<TipoIdentificacion> listaTiposIdentificacion = new ArrayList<>();
        listaTiposIdentificacion.add(new TipoIdentificacion("Coraline","Jones"));
        return listaTiposIdentificacion;
    }

    @GetMapping("/soporte/dato-general/listar-lista-valores")
    @ResponseBody
    public List<Valor> todosValores(@RequestParam(required = false) String pagina,
                                             @RequestParam(required = false) String codigo) {

        List<Valor> listaValores = new ArrayList<>();
        listaValores.add(new Valor("Coraline","Jones"));
        return listaValores;
    }

    @GetMapping("/soporte/dato-general/listar-ciudad-provincia")
    @ResponseBody
    public List<Provincia> todasProvincias(@RequestParam(required = false) String pagina,
                                                   @RequestParam(required = false) String cod_departamento,
                                                   @RequestParam(required = false) String cod_ciudad,
                                                   @RequestParam(required = false) String cod_region) {

        List<Provincia> listaProvincias = new ArrayList<>();
        listaProvincias.add(new Provincia("Coraline","Jones"));
        return listaProvincias;
    }

    @GetMapping("/soporte/dato-general/listar-depatamento")
    @ResponseBody
    public List<Departamento> todosDepartamentos(@RequestParam(required = false) String pagina,
                                                      @RequestParam(required = false) String cod_departamento) {

        List<Departamento> listaDepartamentos = new ArrayList<>();
        listaDepartamentos.add(new Departamento("Coraline","Jones"));
        return listaDepartamentos;
    }

    @GetMapping("/soporte/dato-general/listar-distrito")
    @ResponseBody
    public List<Distrito> todosDistritos(@RequestParam(required = false) String pagina,
                                                  @RequestParam(required = false) String cod_departamento,
                                                  @RequestParam(required = false) String cod_ciudad,
                                                  @RequestParam(required = false) String cod_distrito,
                                                  @RequestParam(required = false) String cod_postal) {

        List<Distrito> listaDistritos = new ArrayList<>();
        listaDistritos.add(new Distrito("Coraline","Jones"));
        return listaDistritos;
    }

    @GetMapping("/soporte/dato-general/listar-tipo-monda")
    @ResponseBody
    public List<TipoMoneda> allRetJud() {

        List<TipoMoneda> listaTiposMoneda = new ArrayList<>();
        listaTiposMoneda.add(new TipoMoneda("Coraline","Jones"));
        return listaTiposMoneda;
    }

}
