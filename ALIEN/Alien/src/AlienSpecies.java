class AlienSpecies {
    private String name;
    private String homePlanet;
    private String specialAbility;

    public AlienSpecies(String name, String homePlanet, String specialAbility) {
        this.name = name;
        this.homePlanet = homePlanet;
        this.specialAbility = specialAbility;
    }

    // Getters for properties

    public String getHomePlanet() {
        return homePlanet;
    }
}