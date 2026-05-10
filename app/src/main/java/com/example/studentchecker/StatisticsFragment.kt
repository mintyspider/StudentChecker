package com.example.studentchecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Тут статистика. Показывать только преподам и только при нажатии на кнопку экрана сканирования
 */
class StatisticsFragment : Fragment() {
// TODO: статистика посещаемости (@+id/lastScanTime, @+id/lastScanText, @+id/arrivedCount, @+id/departedCount, @+id/attendanceProgress, @+id/attendancePercent)

    /** TODO:
     *  При загрузке @+id/StatisticsFragment:
     *    - Загрузить данные текущего сканирования
     *    - Если данных нет: показать "0" везде
     *
     *  @+id/lastScanTime и @+id/lastScanText:
     *    - Вычислить разницу между текущим временем и временем последнего сканирования
     *    - Формат: "число минут назад"
     *    - Обновлять каждые 5 минут
     *
     *  @+id/arrivedCount:
     *    - Отобразить количество студентов, которые ПРИШЛИ на пару
     *    - Данные из результатов последнего сканирования
     *
     *  @+id/departedCount:
     *    - Отобразить количество студентов, которые УШЛИ с пары (не отмечались или ушли раньше)
     *    - Формула: arrivedCount в начале - arrivedCount сейчас
     *
     *  @+id/attendanceProgress:
     *    - Прогресс = (arrivedCount / общее количество студентов) * 100
     *    - Установить прогресс в процентах
     *    - Если arrivedCount = 0, прогресс = 0
     *    - Если arrivedCount = общее количество студентов, прогресс = 100
     *
     *  @+id/attendancePercent:
     *    - Отобразить процент посещаемости: "число"
     *    - Округлить до целого числа
     *
     *  При нажатии на кнопку "Назад" (@+id/toolbar_with_back):
     *    - Закрыть фрагмент и вернуться на предыдущий экран
     */
}