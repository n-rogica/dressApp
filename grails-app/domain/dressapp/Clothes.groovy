package dressapp

class Clothes {

    String name
    enum BodyPart { HEAD, NECK, SHOULDER, CHEST, HANDS, LEGS }
    String mainColor
    enum Formality {HOME(0), SPORTS(1), INFORMAL(2), SEMIFORMAL(3), FORMAL(4), VERYFORMAL(5)}
    String size
    String picture


    static constraints = {
    }

    
}
