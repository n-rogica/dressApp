package dressapp

class Clothes {

    String name
    String mainColor
    static belongsTo = [user: User]
    static constraints = {
    }


}
