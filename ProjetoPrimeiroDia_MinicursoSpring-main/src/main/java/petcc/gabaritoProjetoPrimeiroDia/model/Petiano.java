package petcc.gabaritoProjetoPrimeiroDia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "petianos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Petiano {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "curso", nullable = false)
    private String curso;

    @Column(name = "imagem_perfil", nullable = true)
    private String imagemPerfil;

    
}
