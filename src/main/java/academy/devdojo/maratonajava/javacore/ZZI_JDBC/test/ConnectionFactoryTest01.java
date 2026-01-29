package academy.devdojo.maratonajava.javacore.ZZI_JDBC.test;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(producer);
/*        log.info("INFORMAÇÃO");  // Eventos importantes de negócio que confirmam que o sistema funciona (ex: "Registro salvo com sucesso").
        log.debug("DEPURAÇÃO");  // Informações para desenvolvedores entenderem o fluxo lógico e valores de variáveis durante o desenvolvimento.
        log.warn("AVISO");       // Algo inesperado aconteceu, mas o sistema continua rodando (ex: tentativa de login inválida ou timeout curto).
        log.error("ERRO GRAVE"); // Indica falhas que impedem uma funcionalidade (ex: erro ao conectar no banco ou SQLException).
        log.trace("RASTREIO");   // O nível mais detalhado de todos, usado para seguir o passo a passo minucioso de um algoritmo complexo.*/
    }
}