public class Principal {
    public static void main(String[] args){
        Filme f=new Filme();
        f.setCodigo(13);

        f.setDisponivel(true);
        if(f.isDisponivel()){
            System.out.println(f.getCodigo());
        }
    }
}
