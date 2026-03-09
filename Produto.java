public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    //metodo construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    //setters
    public void setpreco(double preco) {
        this.preco = preco;
    }
    //metodos
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
    public void venderProduto(int quantidade){
        if(this.quantidade >= quantidade){
            this.quantidade -= quantidade;
            System.out.println("vc fez uma venda de "+ quantidade + " seu estoque atual é de: " + getQuantidade());
        }else{
            System.out.println("vc não tem estoque o suficiente para realizar a venda");
        }

    }
    public void dadosProduto(){
        System.out.println(" ");
        System.out.println("----- DADOS DO PRODUTO -----");
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço do produto: " + getPreco());
        System.out.println("Quantidade em estoque: " + getQuantidade());
    }


}
