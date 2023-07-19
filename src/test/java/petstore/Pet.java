//1 - Pacote
package petstore;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

//2 - Bicliotecas
public class Pet {
    String uri = "https://petstore.swagger.io/v2/pet";

    public String lerJson (String caminhoJson) throws IOException {

        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }
    @Test //identifica como um teste
    public void  IncluirPet() throws IOException {
        String jsonBody = lerJson("db/pet1.json");

        // Estrutura do Gherkin
        // dado - quando - entao

        given() //Dado
                .contentType("application/json")
                .log().all()
                .body(jsonBody)
        .when() //Quando
                .post(uri)
        .then() //Então
                .log().all()
                .statusCode(200)
        ;
    }
}
