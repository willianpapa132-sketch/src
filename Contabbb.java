public class Contabbb {
    //atributos
    public int numeroConta;
    protected boolean tipo;
    private String dono;
    private double saldo;
    private boolean status;
    //metodo construtor
    public Contabbb() {
        this.saldo = 0;
        this.status = false;
    }

    //getters
    public int getNumeroConta() {
        return numeroConta;
    }
    public boolean isTipo() {
        return tipo;
    }
    public String getDono() {
        return dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean isStatus() {
        return status;
    }

    //setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    //metodos
    public void abrirConta(String tipoc){
        if (tipoc == "CORRENTE"){
            this.setTipo(true);
            this.setStatus(true);
            System.out.println("vc abriu uma conta corrente com sucesso");
        }else if (tipoc == "POUPANÇA"){
            this.setTipo(false);
            this.setStatus(true);
            System.out.println("vc abriu uma conta poupança com sucesso");
        }else{
            System.out.println("vc digitou um tipo de conta invalida");
        }
    }
    public void fecharconta(){
        if(this.saldo == 0){
            this.setStatus(false);
            System.out.println("vc fechou sua conta com sucesso");
        }else{
            System.out.println("vc não pode fechar sua conta porque ainda tem dinheiro nela ou valores em pendencia");
        }
    }
    public void depositar(double valor){
        if(this.status){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("vc fez um deposito de R$ " + valor + " com sucesso");
        }else{
            System.out.println("vc não pode depositar em uma conta fechada");
        }
    }
    public void sacar(double valor){
        if(this.status){
            if(this.saldo >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("vc fez um saque de R$ " + valor + " com sucesso");
            }else{
                System.out.println("vc não tem saldo o suficiente para realizar o saque");
            }
        }else{
            System.out.println("vc não pode sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        if(this.status == true){
            if(this.tipo == true){
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("vc pagou a mensalidade de R$ 12,00 com sucesso");
            }else{
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("vc pagou a mensalidade de R$ 20,00 com sucesso");
            }
        }else{
            System.out.println("vc não pode pagar a mensalidade de uma conta fechada");
        }
    }
}
