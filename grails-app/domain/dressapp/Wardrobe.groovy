package dressapp

class Wardrobe {

    List<Clothes> clothes
    static belongsTo = [user: User]

    static constraints = {
    }

    void addClothes(Clothes cloth) {
      clothes.add(cloth);
    }
}
