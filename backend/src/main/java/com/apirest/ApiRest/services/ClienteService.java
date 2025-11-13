package com.apirest.ApiRest.services;

import com.apirest.ApiRest.entities.Cliente;
import com.apirest.ApiRest.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Cliente> buscarPorId(String id) {
        return repository.findById(id);
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente atualizar(String id, Cliente novoCliente) {
        return repository.findById(id)
                .map(c -> {
                    c.setNome(novoCliente.getNome());
                    c.setEmail(novoCliente.getEmail());
                    c.setTelefone(novoCliente.getTelefone());
                    c.setCpf(novoCliente.getCpf());
                    c.setCidade(novoCliente.getCidade());
                    c.setUf(novoCliente.getUf());
                    c.setEndereco(novoCliente.getEndereco());
                    return repository.save(c);
                })
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado: " + id));
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}
