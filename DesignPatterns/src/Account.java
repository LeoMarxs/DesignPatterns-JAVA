interface Account {
    void accountType();
}
  

class SavingsAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Conta Poupança");
        System.out.println("--------------------------------------------");
    }
}


class CheckingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Conta Corrente");
        System.out.println("--------------------------------------------");
    }
}