package petcc.gabaritoProjetoPrimeiroDia.model;

import jakarta.persistence.*;

@Entity
@Table (name = "petianos")
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

    // Construtores, getters e setters

    public Petiano() {
    }

    public Petiano(Long id, String nome, String curso, String imagemPerfil) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.imagemPerfil = imagemPerfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getImagemPerfil() {
        return imagemPerfil;
    }

    public void setImagemPerfil(String imagemPerfil) {
        this.imagemPerfil = imagemPerfil;
    }
}
