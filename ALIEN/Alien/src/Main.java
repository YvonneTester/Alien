import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AlienSpecies zorgon = new AlienSpecies("Zorgon", "Zorgon Prime", "Telepathy");
        AlienSpecies xeltron = new AlienSpecies("Xeltron", "Xeltron IX", "Invisibility");
        AlienSpecies quorin = new AlienSpecies("Quorin", "QueOne-20", "Time rewarding");
        AlienSpecies vultran = new AlienSpecies("Vultran", "Mars", "Fire Blow");

        AlienSpeciesDatabase speciesDatabase = new AlienSpeciesDatabase();
        speciesDatabase.addSpecies("Zorgon", zorgon);
        speciesDatabase.addSpecies("Xeltron", xeltron);
        speciesDatabase.addSpecies("Quorin", quorin);
        speciesDatabase.addSpecies("Vultran", vultran);

        // Retrieve and display species details
        AlienSpecies retrievedZorgon = speciesDatabase.getSpecies("Zorgon");
        AlienSpecies retrievedXeltron = speciesDatabase.getSpecies("Xeltron");
        AlienSpecies retrievedQuorin = speciesDatabase.getSpecies("Quorin");
        AlienSpecies retrievedVultran = speciesDatabase.getSpecies("Vultran");

        System.out.println("Retrieved Zorgon: " + retrievedZorgon.getHomePlanet());
        System.out.println("Retrieved Xeltron: " + retrievedXeltron.getHomePlanet());
        System.out.println("Retrieved Quorin: " + retrievedQuorin.getHomePlanet());
        System.out.println("Retrieved Vultran: " + retrievedVultran.getHomePlanet());



        // Remove a species and display remaining species
        speciesDatabase.removeSpecies("Zorgon");

        System.out.println("Species in the database after removing Zorgon:");
        for (Map.Entry<String, AlienSpecies> entry : speciesDatabase.getSpeciesDatabase().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getSpecialAbility());
        }
    }
}