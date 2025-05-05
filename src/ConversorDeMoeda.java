
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoeda {

    public double converter(String origem, String destino, double valor) throws Exception {

        HttpClient cliente = HttpClient.newHttpClient();

        final String apiKey = System.getenv("EXCHANGE_API_KEY");

        if (apiKey == null) {
            System.err.println("Erro: variável de ambiente EXCHANGE_API_KEY não encontrada.");
            return 0;
        }

        String url = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", apiKey, origem, destino);
        System.out.println("URL segura: " + url);


        //Chave API retirada por seguranca!


        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();


        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());



        JsonObject json = JsonParser.parseString(resposta.body()).getAsJsonObject();


        if (json.has("conversion_rate")) {
            double taxa = json.get("conversion_rate").getAsDouble();
            double resultado = valor * taxa;


            System.out.printf("\n%.2f %s (%s) = %.2f %s (%s)\n",
                    valor, origem, origem,
                    resultado, destino, destino);


            System.out.printf("\nAtualmente, 1 %s equivale a %.4f %s.\n", origem, taxa, destino);

            return resultado;
        } else {
            throw new Exception("Erro ao obter taxa de conversão. Verifique os códigos de moeda.");
        }
    }
}
