package com.loop.demo.Ninjas.Model;

import com.loop.demo.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

// Entity ele transforma uma classe em uma entidade no BD
@Entity
@Table(name= "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}