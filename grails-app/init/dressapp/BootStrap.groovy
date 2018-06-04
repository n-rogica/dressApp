package dressapp

class BootStrap {

    def init = { servletContext ->
        def wardrobe = new Wardrobe()
        def wardrobe2 = new Wardrobe()
        def user1 = new User(nombre: 'pipo', password: 'quecarajoteimporta', wardrobe: wardrobe).save()
        def user2 = new User(nombre: 'papo', password: 'boyeroamigo', wardrobe: wardrobe2).save()
        def camisa = new Clothes(name: 'camisa', mainColor: 'blanca', user: user1).save()
        def pantalon = new Clothes(name: 'pantalon piola', mainColor: 'negro', user: user1).save()
        def zapas = new Clothes(name: 'alta llanta', mainColor: 'roja', user: user1).save()
        def gorrita = new Clothes(name: 'gorra fachera', mainColor: 'amarilla', user: user2).save()
    }
    def destroy = {
    }
}
