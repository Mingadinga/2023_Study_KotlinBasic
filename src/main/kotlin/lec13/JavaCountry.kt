package lec13

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}