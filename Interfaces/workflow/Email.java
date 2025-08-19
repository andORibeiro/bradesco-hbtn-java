public class Email implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        String tipo = mensagem.getTipoMensagem().name();
        String texto = mensagem.getTexto();
        System.out.println("[EMAIL] {" + tipo + "} - " + texto);
    }
}
