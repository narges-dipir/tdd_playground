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

    @Test
    fun `getSearchUrl non-null check assertion`() {
        val nonNullResult = getSearchUrl("toaster")

        if (nonNullResult != null) {
            print("Success\n")
        } else {
            throw AssertionError("Result was null")
        }
    }
}