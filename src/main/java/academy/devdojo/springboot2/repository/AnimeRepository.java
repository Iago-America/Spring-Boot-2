package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;

import java.util.List;
//Repository basicamente a conexão com o banco de dados )Listar, procurar etc)
public interface AnimeRepository {
    List<Anime> listAll();
}
