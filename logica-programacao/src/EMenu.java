public enum EMenu {
    SAIR("Sair"),
    SOMA("Somar"),
    SUBTRACAO("Subtração"),
    DIVISAO("Divisão"),
    MULTIPLICACAO("Multiplicação"),
    HISTORICO("Histórico");

    EMenu(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao(){
        return descricao;
    }
}
