package woowacourse.movie.presentation.ui.detail

import woowacourse.movie.presentation.dto.ReservationData

interface MovieDetailContract {
    interface View {
        fun showMovieDetail(
            posterImageId: Int,
            title: String,
            screeningDate: String,
            runningTime: Int,
            summary: String,
        )

        fun showReservationCount(count: Int)

        fun moveToReservationPage(reservationData: ReservationData)

        fun showMessage(message: String)
    }

    interface Presenter {
        fun loadMovieDetails(
            posterImageId: Int,
            title: String,
            screeningDate: String,
            runningTime: Int,
            summary: String,
        )

        fun minusReservationCount()

        fun plusReservationCount()

        fun updateReservationCount(reservationCount: Int)

        fun reservationCountDisplay()

        fun requestReservationResult()
    }
}