public class Slack implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        String tipo = mensagem.getTipoMensagem().name();
        String texto = mensagem.getTexto();
        System.out.println("[SLACK] {" + tipo + "} - " + texto);
    }
}
    