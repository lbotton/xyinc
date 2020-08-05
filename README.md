# XY-Inc

Sistema de cadastro de coordenadas GPS e cálculo Euclidiano dos Pontos de Interesse dentro de determinada área.

## Stack
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database
- Spring Dev Tools
- Timeleaf
- Junit
- Maven

## Instalação

Faça o download do projeto.

```bash
git clone https://github.com/lbotton/xyinc
```

Utilize o [Maven](https://maven.apache.org) para rodar.

```bash
mvn spring-boot:run
```

## Usage

Acesse para listar os Pontos de Interesse disponíveis no banco de dados (H2)

```python
localhost:8080/list
```

Acesse para adicionar um Ponto de Interesse no banco de dados (H2)

```python
localhost:8080/add
```

Acesse para adicionar um verificar quais Pontos de Interesse estão disponíveis em uma área (H2)

```python
localhost:8080/find
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
