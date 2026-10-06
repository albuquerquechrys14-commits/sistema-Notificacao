void main() {


Notificador email = new Email();
Notificador sms = new SMS();
email.enviar("catapimbas");
sms.enviar("nao é assim mas agora é");
}