
package lista3.ex1;

import java.util.Objects;

/**
 *
 * @author edson
 */
public class Aluno {
    private String ra;
    private String nome;

    public Aluno() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.ra);
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.ra, other.ra)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String imprimir(){
        return "RA: "+ this.ra + "\n" +
                "Nome: "+ this.nome;
    }
}