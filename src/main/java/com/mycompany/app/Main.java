public class Main {
    public static void main (String[] args) {
        Autor autor = new Autor ("Jessica Felix", 36, "Brasileira" );
        Livro livro = new Livro("Java for Begginers", autor, "Tecnologia");
        Usuario usuario =  new Usuario ("Lucas Rafael", 25);

        livro.emprestar(usuario);

        livro.devolver();

        if (livro.getDisponivel()) {
            System.out.println("O livro nao esta disponivel");
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Genero: " + livro.getGenero());
            
            Emprestimo emp = usuario.getHistoricoEmprestimos().get(0);
            
            System.out.println("Usuario: " + emp.getUsuario().getNome());
            System.out.println("Idade: " + emp.getUsuario().getIdade());
            
            System.out.println("Data de Retirada: " + emp.getDataRetirada());
            System.out.println("Data de Devolucao: " + emp.getDataDevolucao());
        }
    }
}
    