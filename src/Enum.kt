enum class Enum(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun description(): String {
        return if (isWeekend) {
            "$name is a weekend."
        } else {
            "$name is a weekday."
        }
    }
}
