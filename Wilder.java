public class Wilder{ //Création d'une classe Wilder

    //attributs
    private String firstname; //ajout de l'attribut string
    private Boolean aware; //ajout de l'attribut boolean

    //constructeur
   public Wilder (String firstname, Boolean aware){ // Créer un constructeur permettant d'initialiser firstname et aware
        this.firstname = firstname;
        this.aware = aware;
   } 
        
   // Ajouter des getters et setters pour tous les attributs, en respectant les conventions
   public String getFirstname(){
       return this.firstname;
   }

   public Boolean isAware(){
       return this.aware;
   }

   public void setFirstname (String firstname){
        this.firstname = firstname;
   }

   public void setAware (Boolean aware) {
        this.aware = aware;
   }

   /* Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou
   "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware */

   public String whoAmI(){
        if (aware) {
            return ("Je m'appelle" + " " + firstname + " " + "et je suis aware");
        }
       else{
            return ("Je m'appelle" + " " + firstname + " " + "et je ne suis pas aware");
       }   
   }
}