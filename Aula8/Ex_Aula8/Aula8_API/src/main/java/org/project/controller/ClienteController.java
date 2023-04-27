package org.project.controller;
import org.project.constant.Constante;
import org.project.model.Cliente;
import org.project.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*@Controller
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    public void inserir(Cliente cliente){
        clienteService.salvar(cliente);
    }

    public void deletar (Cliente cliente){
        clienteService.deletar(cliente);
    }

    public List<Cliente> consultarTodos(){
        return clienteService.consultarTudo();
    }
@GetMapping(Constante.API_URL + "/{id}")
    public Optional<Cliente> consultarPorId(@PathVariable Cliente cliente){
        return clienteService.consultarPorId(cliente);
    }
}
*/
@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(Constante.API_CLIENT)
    public void salvar(@RequestBody Cliente client){
        clienteService.salvar(client);
    }

    @GetMapping(Constante.API_CLIENT)
    public List<Cliente> findAll(){
        return clienteService.consultarTudo();
    }

    @PutMapping(Constante.API_CLIENT)
    public void update (@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
    }

    @DeleteMapping(Constante.API_CLIENT + "/{id}")
    public void delete(@PathVariable("id") String id){
        clienteService.deletar(id);
    }

    @GetMapping(Constante.API_CLIENT + "/{id}")
    public Optional<Cliente> findById(@PathVariable("id") String id){
        return clienteService.consultarPorId(id);
    }
}