package br.com.smart_phone.browser;

public abstract class Browser {

    public void showPage() {
        System.out.println("Exibindo página.");
    }

    public void refreshPage() {
        System.out.println("Atualizando página.");
    }

    public void addNewTab() {
        System.out.println("Abrindo nova aba.");
    }
}
