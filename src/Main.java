import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                *********************************\s
                \s
                Olá! Seja bem vindo ao meu Conversor de Moedas!\s
                \s
                Digite o código de três letras das moedas que deseja \
                converter,\s
                (Ex.: Real Brasileiro: BRL) \
                em seguida o valor para conversão.\s
                \s
                *********************************
                """);

        System.out.println("Digite a moeda de origem: ");
        var base_code = scanner.nextLine().toUpperCase();

        System.out.println("Digite a moeda destino: ");
        var target_code = scanner.nextLine().toUpperCase();

        System.out.println("Digite o valor para conversão: ");
        var amount = scanner.nextDouble();


        String link = "https://v6.exchangerate-api.com/v6/" +
                "6ab1c8b4afa18080d5a64c82/latest/" + base_code;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .build();

        HttpResponse<String> response = client.send (request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        if (jsonObject.has("conversion_rates")) {
            JsonObject conversion_rates = jsonObject.getAsJsonObject("conversion_rates");

            if(conversion_rates.has(target_code)){
                double exchangeRate = conversion_rates.get(target_code).getAsDouble();

                double convertedValue = amount * exchangeRate;
                System.out.println("O valor convertido é " + convertedValue + " " + target_code);
            } else {
                System.out.println("Moeda destino não encontrada");
            }
        } else {
            System.out.println("Erro na conversão, por favor digite valores válidos");
        }
    }
}
