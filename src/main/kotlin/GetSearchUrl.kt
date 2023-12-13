fun main(args: Array<String>) {

}
fun getSearchUrl(query: String?): String? {
    return query?.let {
        "https:/www.google.com/search?q=$query"
    }
}