package jsongson.homework2

class MoneyConvert {
    var id: Int? = null
    var code: String? = null
    var ccy: String? = null
    var ccyNm_RU: String? = null
    var ccyNm_UZ: String? = null
    var ccyNm_EN: String? = null
    var nominal: String? = null
    var rate: String? = null
    var diff: String? = null
    var date: String? = null

    constructor(
        id: Int?,
        code: String?,
        ccy: String?,
        ccyNm_RU: String?,
        ccyNm_UZ: String?,
        ccyNm_EN: String?,
        nominal: String?,
        rate: String?,
        diff: String?,
        date: String?
    ) {
        this.id = id
        this.code = code
        this.ccy = ccy
        this.ccyNm_RU = ccyNm_RU
        this.ccyNm_UZ = ccyNm_UZ
        this.ccyNm_EN = ccyNm_EN
        this.nominal = nominal
        this.rate = rate
        this.diff = diff
        this.date = date
    }

    constructor()


    override fun toString(): String {
        return "MoneyConvert(id=$id, code=$code, ccy=$ccy, ccyNm_RU=$ccyNm_RU, ccyNm_UZ=$ccyNm_UZ, ccyNm_EN=$ccyNm_EN, nominal=$nominal, rate=$rate, diff=$diff, date=$date)"
    }

}