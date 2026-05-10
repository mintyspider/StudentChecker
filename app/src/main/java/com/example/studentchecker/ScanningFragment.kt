package com.example.studentchecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Этот экран инициализируется всегда, если заходит Преподаватель во время сканирования.
 * По кнопке @+id/btnMenu из toolbar_top.xml адо пересылать пользователя на настройки.
 * А теперь кнопочки, которые я запихаю в TODO :3
 * Больше ничего делать тут не надо, разве что картинку менять.
 */

class ScanningFragment : Fragment() {
    // TODO: подменяй картинку в темной теме на scan_dark.png
    /** TODO:
     *  по кнопке @+id/btnStats отправляешь юзера на [StatisticsFragment]
     *  по кнопке @+id/btnPause приостанавливаешь сканирование и отправляешь юзера на [ScanningPausedFragment]
     *  по кнопке @+id/btnStop останавливаешь сканирование, отправляешь результаты на сервер,
     *  юзеру показываешь [ScanningFinishedFragment].
     *  Пока отправляется на сервер, всплывающее уведомление:
     *  "Сканирование успешно завершено. Результаты отправлены на сервер"
     *  Просто скопируй и вставь.
     */
}