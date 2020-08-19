import **** ;

public class MainMenu {

  private static Scanner sc = new Scanner(System.in);

  public static void effectuerReservation() {
        System.out.print("Combien de voitures voulez-vous saisir ? ");
        int nb = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<nb; i++) {
            System.out.println("Indiquez une marque, un modèle, et une année de fabrication : ");
            String saisieMarque = sc.nextLine();
            String saisieModele = sc.nextLine();
            int saisieAnnee = sc.nextInt();
            Voiture c = new Voiture(saisieMarque, saisieModele, saisieAnnee);
            l.add(c);
            sc.nextLine();
        }
        System.out.println(l);
        System.out.println();
  }







  public static void main(String[] args) throws SQLException {
    Connection cnx = DriverManager.getConnection("ADRESSE WEB","IDENTIFIANT", "MOT DE PASSE");
    Statement st = cnx.createStatement(); ***???****

    int choix = -1;

    while (choix != 0)
      {
        System.out.println();
        System.out.println("   *=*=*=*     M E N U     *=*=*=*   ");
        System.out.println(" 1 - Effectuer une nouvelle réservation");
        System.out.println(" 2 - Consulter les réservations");
        System.out.println(" 3 - Modifier une réservation");
        System.out.println(" 4 - Effacer une réservation");
        System.out.println(" 5 - Enregistrer un nouveau client");
        System.out.println(" 6 - Modifier des informations client");
        System.out.println(" 7 - Modifier les données d'une chambre");
        System.out.println(" 0 - Quitter");
        System.out.println();
        System.out.println("Votre choix : ");

        choix = sc.nextInt();

        switch(choix)
        {
          case 1 : effectuerReservation();
            break;

          case 2 : consulterReservation();
            break;

          case 3 : modifierReservation();
            break;
        
          case 4 : effacerReservation();
            break;
          
          case 5 : enregistrerClient();
            break;
          
          case 6 : modifierClient();
            break;

          case 7 : modifierChambre();
            break;

          case 0 : System.exit(0);
            cnx.close();
            break;

          default : System.out.println("Indiquez un chiffre entre 0 et 6");
        }
      }
    }
}
