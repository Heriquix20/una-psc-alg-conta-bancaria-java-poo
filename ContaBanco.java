public class ContaBanco {
    //
        private String nome;
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
    
    //
        private int numeroConta;
        public int getNumeroConta() {
            return numeroConta;
        }
        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }
        
    //
        private double saldoInicial;
        public double getSaldoInicial() {
            return saldoInicial;
        }
        public void setSaldoInicial(double saldo) {
        saldoInicial = saldo;
        }
    
    //
        public double depositar(double deposito) {
            return saldoInicial + deposito;
        }
    //
        public double sacar(double saque) {
            double saldoTotalSaque = saldoInicial - saque;
            if (saque > saldoInicial) {
                System.out.println("\nSaldo insuficiente para realizar a operação.");
            }
            else if (saque > 5000) {
                System.out.println("\nValor do saque acima do permitido.");
            }
            else {
                System.out.println("\nSaque de " + saque + " reais realizado com sucesso");
                System.out.println("Valor total da conta: " + saldoTotalSaque + " reais");
            }
            return saldoInicial - saque;
        }
    }