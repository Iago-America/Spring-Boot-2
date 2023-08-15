package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //Domain representa basicamente o que vem do banco de dados
@AllArgsConstructor //Gera um construtor com todos o valores
public class Anime {
    private Long id;
    private String name;
}
