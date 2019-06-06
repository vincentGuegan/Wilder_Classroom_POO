public class Classroom{ // Créer une classe Classroom avec une méthode main()

    public static void main(String[] args){

        // Ajouter des références vers plusieurs instances de la classe Wilder dans la méthode main() de Classroom
        Wilder vincent = new Wilder("vincent", true);
        Wilder julien = new Wilder("julien", false);
        Wilder remy = new Wilder("remy", false);
        Wilder myriam = new Wilder("myriam", true);

        // Pour chacune des références, affiche le retour de la méthode whoAmI() dans le terminal
        System.out.println(vincent.whoAmI());
        System.out.println(julien.whoAmI());
        System.out.println(remy.whoAmI());
        System.out.println(myriam.whoAmI());
    }
}