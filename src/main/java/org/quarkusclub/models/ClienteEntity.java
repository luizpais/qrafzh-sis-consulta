package org.quarkusclub.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class ClienteEntity extends PanacheEntityBase {

    @Id
    private UUID id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;
    private String nomePlano;
    private String indicacao;
    @Column(name = "id_convenio")
    private UUID idConvenio;
    @Column (name = "id_conveniado")
    private UUID idConveniado;
    @Column(name = "status_conveniado")
    private Boolean statusConveniado;

}
