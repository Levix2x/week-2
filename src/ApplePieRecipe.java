public class ApplePieRecipe {
    private Ingredient boter;
    private Ingredient whiteSugar;
    private Ingredient zelfrijzendBakmeel;
    private Ingredient ei;
    private Ingredient vanilleSuiker;
    private Ingredient zout;
    private Ingredient appels;
    private Ingredient kristalSuiker;
    private Ingredient kaneel;
    private Ingredient paneerMeel;

    public ApplePieRecipe() {
        // Instantieer de ingrediënten voor het appelgebak
        this.boter = new Ingredient(200, "gram", "ongezouten roomboter");
        this.whiteSugar = new Ingredient(200, "gram", "witte basterdsuiker");
        this.zelfrijzendBakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
        this.ei = new Ingredient(1, "stuk(s)", "ei");
        this.vanilleSuiker = new Ingredient(8, "gram", "vanillesuiker");
        this.zout = new Ingredient(1, "snuf", "zout");
        this.appels = new Ingredient(1500, "gram", "zoetzure appels");
        this.kristalSuiker = new Ingredient(75, "gram", "kristalsuiker");
        this.kaneel = new Ingredient(3, "theelepels", "kaneel");
        this.paneerMeel = new Ingredient(15, "gram", "paneermeel");
    }


    public void printIngredients() {
        System.out.println("Ingrediënten voor appeltaart:");
        printIngredient(boter);
        printIngredient(whiteSugar);
        printIngredient(zelfrijzendBakmeel);
        printIngredient(ei);
        printIngredient(vanilleSuiker);
        printIngredient(zout);
        printIngredient(appels);
        printIngredient(kristalSuiker);
        printIngredient(kaneel);
        printIngredient(paneerMeel);
        System.out.println("------------------------");
    }


    private void printIngredient(Ingredient ingredient) {
        System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }

    // Voeg hier methoden toe voor elk van de stappen in het recept
    public void stappen() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)\n" +
                "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.\n" +
                "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.\n" +
                "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n" +
                "Vet de springvorm in en bestrooi deze met bloem\n" +
                "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.\n" +
                "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.\n" +
                "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.\n" +
                "Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken\n" +
                "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}
