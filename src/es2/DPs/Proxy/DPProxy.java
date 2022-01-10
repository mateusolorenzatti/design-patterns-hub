package es2.DPs.Proxy;

import es2.DPs.Categorias;
import es2.DPs.DesignPattern;
import es2.DPs.Proxy.src.Universidade;
import es2.DPs.Proxy.src.UniversidadeProxy;

public class DPProxy implements DesignPattern {
    @Override
    public String getName() {
        return "Proxy";
    }

    @Override
    public String getCategoria() {
        return Categorias.STRUCTURAL;
    }

    @Override
    public String getDescription() {
        return "O padrão Proxy permite que o acesso a algum objeto seja feito \n" +
                " por intermédio de outra classe, possibilitando que outra \n" +
                " ação seja feita antes que o recurso solicitado seja acessado. \n" +
                " Isso pode servir para logs, middlewares e também como um \n" +
                " mecanismo de segurança na implementação.";
    }

    @Override
    public void runExample() {
        Universidade universidade = new UniversidadeProxy("errado");
        System.out.println("Login Incorreto");
        System.out.println(universidade.getNomeInstituicao());
        System.out.println(universidade.getNomeCurso());
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        universidade = new UniversidadeProxy("correto");
        System.out.println("Login válido");
        System.out.println(universidade.getNomeInstituicao());
        System.out.println(universidade.getNomeCurso());
    }
}
