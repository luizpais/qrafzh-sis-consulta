package org.quarkusclub.services;

import org.quarkusclub.dtos.ClienteDTO;
import org.quarkusclub.models.exceptions.ClienteNaoCadastradoException;

import java.util.List;
import java.util.UUID;

public interface CadastroClienteServiceInterface {
    ClienteDTO createCliente(ClienteDTO cliente);

    ClienteDTO updateAllCliente(UUID idcliente, ClienteDTO cliente) throws ClienteNaoCadastradoException;

    ClienteDTO updateParcialCliente(UUID idcliente, ClienteDTO cliente) throws ClienteNaoCadastradoException;

    List<ClienteDTO> consultaClientes();

    ClienteDTO consultaCliente(UUID idcliente) throws ClienteNaoCadastradoException;
}
