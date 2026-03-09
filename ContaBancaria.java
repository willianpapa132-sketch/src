public class ContaBancaria{
    private String nome;
    private double saldo;
    private int numeroConta;


// metodo construtor
    public ContaBancaria(String nome , int numeroConta) {
        this.nome = nome;
        this.saldo = 0;
        this.numeroConta = numeroConta;
    }
//getters
    public double getSaldo() {
        return saldo;
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
//setter
    public void setNome(String nome) {
        this.nome = nome;
    }
//metodos
    public void  depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }else{
            System.out.println("vc não tem saldo o suficiente para realizar o saque.");
        }
    }
    public void dadosConta(){
        System.out.println("----- DADOS DA CONTA BANCÁRIA -----");
        System.out.println("Nome do titular: " + getNome());
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("Número da conta: " + getNumeroConta());
    }
    public void transferir(ContaBancaria contaDestino, double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para a conta de " + contaDestino.getNome());
        }else{
            System.out.println("vc não tem saldo o suficiente para realizar a transferência.");
        }
    }




    
}