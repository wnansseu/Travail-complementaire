package utbm.app.application.util

object TimeUtils {
    var times: MutableMap<Int, String> = mutableMapOf(
            Pair(0, "0 H"),
            Pair(1, "1 H"),
            Pair(2, "2 H"),
            Pair(3, "3 H"),
            Pair(4, "4 H"),
            Pair(5, "5 H"),
            Pair(6, "6 H"),
            Pair(7, "7 H"),
            Pair(8, "8 H"),
            Pair(9, "9 H"),
            Pair(10, "10 H"),
            Pair(11, "11 H"),
            Pair(12, "12 H"),
            Pair(13, "13 H"),
            Pair(14, "14 H"),
            Pair(15, "15 H"),
            Pair(16, "16 H"),
            Pair(17, "17 H"),
            Pair(18, "18 H"),
            Pair(19, "19 H"),
            Pair(20, "20 H"),
            Pair(21, "21 H"),
            Pair(22, "22 H"),
            Pair(23, "23 H")
    )

    fun getDisplayableTime(time: Int): String = if (time in 0..23) times[time]!! else "?"
}
