public class Banco {

    public int numConta;
    private String usuario;
    private float valor;
    protected int tipoDeConta;
    private boolean status;

    public void saudacao(){ System.out.println(getUsuario() + ","); }
    public void fecharConta(){
        saudacao();

        if(getStatus()){
            if(this.getValor() > 0){ System.out.println("Não é possível fechar a conta à menos que seu saldo seja igual à zero"); }
            else{
                setStatus(false);
                System.out.println("Conta fechada com sucesso");
            }
        } else{ System.out.println("Sua conta já está fechada!"); }
    }
    public void abrirConta(){
        saudacao();

        if(!getStatus()){
            setStatus(true);
            System.out.println("Conta aberta com sucesso");
        }
        else{ System.out.println("Sua conta já está aberta!"); }

    }
    public void sacar(float money){
        saudacao();

        if(getValor() >= money){
            if(getStatus()){
                setValor(getValor() - money);

                System.out.println("Você acabou de retirar R$ " + money);
                System.out.println("Dessa maneira, você possui R$ " + getValor() + " guardado");
            }
            else{ System.out.println("Não foi possível efetuar o saque, pois sua conta está fechada"); }
        }
        else{
            System.out.println("Não foi possível efetuar o saque, pois você não possui saldo suficinete");
            System.out.println("Como você não possui saldo suficiente, será tirado tudo oq há em valor na sua conta logo:");

            float saldoTotal = getValor();
            setValor(getValor() - saldoTotal);

            System.out.println("Sacado: R$ " + saldoTotal);
            System.out.println("Saldo: R$ " + getValor());
        }
    }
    public void depositar(float money){
        saudacao();

        if(status){
            setValor(getValor() + money);

            System.out.println("Você acabou de depositar R$ " + money);
            System.out.println("Dessa maneira, você possui R$ " + getValor() + " guardado");
        }
        else{ System.out.println("Não foi possível efetuar o deposito, pois a sua conta está fechada"); }
    }
    public void pagarMensalidade(){
        saudacao();

        if(getStatus()){
            int pagamento = 0;
            String tipoConta = "";
            if(getTipoDeConta() == 0) {

                pagamento = 12;
                tipoConta = "Corrente";
            } else if (getTipoDeConta() == 1) {

                pagamento = 20;
                tipoConta = "Poupança";
            }

            setValor(getValor() - pagamento);

            System.out.println("Como sua conta é do tipo "+ tipoConta +", você paga R$ " + pagamento);
            System.out.println("Mensalidade mensal paga, você possui R$" + getValor() + " de saldo");
        }
        else {
            System.out.println("A conta está inativa, logo não pode ser cobrada nenhuma mensalidade");
        }
    }

    public String getUsuario(){ return this.usuario; }
    public float getValor(){ return this.valor; }
    public int getTipoDeConta(){ return this.tipoDeConta; }
    public boolean getStatus(){ return this.status; }

    public void setUsuario(String usuario){ this.usuario = usuario; }
    public void setValor(float valor){ this.valor = valor; }
    public void setTipoDeConta(int tipoDeConta){ this.tipoDeConta = tipoDeConta; }
    public void setStatus(boolean status){ this.status = status; }

    public Banco(String u, float v, int t){
        setUsuario(u);
        setTipoDeConta(t);
        setValor(v);

        System.out.println("Seja bem-vindo(a) ao Banco da SOP-CE");
        System.out.println("Seu nome: " + u);

        if(t == 0){
            valor = getValor();
            setValor(valor += 50);
            System.out.println("Tipo de conta: Corrente");
        }
        else if(t == 1) {
            valor = getValor();
            setValor(valor += 150);
            System.out.println("Tipo de conta: Poupança");
        }

        System.out.println("Dinheiro na conta R$: " + getValor());
    }
}
