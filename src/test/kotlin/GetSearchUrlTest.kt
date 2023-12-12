import org.junit.jupiter.api.Test

class GetSearchUrlTest {

    @Test
    fun `getSearchUrl null check assertion`() {
        val nullResult = getSearchUrl(null)
        if (nullResult == null) {
            print("Success\n")
        } else {
            throw AssertionError("Result was not null")
        }
    }
}