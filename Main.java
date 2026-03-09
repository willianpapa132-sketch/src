public class Main {
    public static void main(String[] args) {
    Produto p1 = new Produto("camisa", 50.0, 10);
    p1.setpreco(80.0);
    p1.venderProduto(8);
    p1.adicionarQuantidade(10);
    p1.dadosProduto();
    }

}