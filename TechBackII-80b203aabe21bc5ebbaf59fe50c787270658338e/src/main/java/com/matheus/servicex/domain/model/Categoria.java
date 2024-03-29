package com.matheus.servicex.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(
        name = "categoria"
)
@Data
@EqualsAndHashCode(
        onlyExplicitlyIncluded = true
)
@NoArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(
            name = "nome",
            nullable = false
    )
    private String nome;

    @OneToMany(
            mappedBy = "categoria",
            cascade = CascadeType.ALL
    )
    private List<Servico> servicos;
}
