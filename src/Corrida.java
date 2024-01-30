public class Corrida {
    public static void main(String[] args) {
       Carro carro1 = new Carro("Porshe", 90); //criação dos carros
       Carro carro2 = new Carro("Fiat", 70);
       Carro carro3 = new Carro("Citroen", 50);
       Carro carro4 = new Carro("BMW", 130);

       Carro[] carros = {carro1, carro2, carro3, carro4};

       for (Carro carro : carros){
           carro.correr();
       }

       Carro.vencedor = Vencedor(carros);
       System.out.println("O carro vencedor é: " + Carro.vencedor);
    }

    static String Vencedor(Carro[]carros){
        Carro vencedor = carros[0];
        for (int i = 1; i < carros.length; i++){
            if (carros[i].tempo < vencedor.tempo) {
                vencedor = carros[i];
            }
        }
        return vencedor.nome; // retornar nome do carro vencedor
    }
}