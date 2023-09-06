public class FormatarCep {

    public static void main(String[] args) {
        try{
            String meuCep = formatarCep("1234568");
            System.out.println(meuCep);
        }catch (CepInvalidoException e){
            System.err.println("Cep invalido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{


        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
