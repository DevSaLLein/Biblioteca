public class Caneta {
   String modelo;
   String cor;
   float ponta;
   int carga;
   boolean tampada;

   void status(){
      System.out.println("Uma caneta " + this.cor);
      System.out.println("Está tampada? " + (this.tampada ? "sim" : "não"));
   }
   public void rabiscar(){}
   public void tampar() {
      if(this.tampada){
         System.out.println("A caneta já está tampada");
      } else {
         this.tampada = true;
      }
   }
   public void destampar(){
      if(this.tampada){
         this.tampada = false;
      } else {
         this.tampada = true;
      }
   }
}
