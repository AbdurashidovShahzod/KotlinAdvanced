package file.homework5

class FootballTeam {
    var klubNomi: String = ""
    var uyStadioni:String = ""
    var ligaPozitsiyasi:String = ""
    var utkazibYuborilganGol:Int = 0
    var urilganGollar:Int = 0
    var olinganBallar:Int = 0
    var sana:String = ""
    var azolar:String = ""

    constructor(
        klubNomi: String,
        uyStadioni: String,
        ligaPozitsiyasi: String,
        utkazibYuborilganGol: Int,
        urilganGollar: Int,
        olinganBallar: Int,
        sana: String,
        azolar: String
    ) {
        this.klubNomi = klubNomi
        this.uyStadioni = uyStadioni
        this.ligaPozitsiyasi = ligaPozitsiyasi
        this.utkazibYuborilganGol = utkazibYuborilganGol
        this.urilganGollar = urilganGollar
        this.olinganBallar = olinganBallar
        this.sana = sana
        this.azolar = azolar
    }
}