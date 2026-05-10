package com.example.studentchecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Этот экран инициализируется всегда, если Преподаватель приостановил сканирование.
 * По кнопке @+id/btnMenu из toolbar_top.xml адо пересылать пользователя на настройки.
 * А теперь кнопочки, которые я запихаю в TODO :3
 * Больше ничего делать тут не надо, разве что картинку менять.
 */
class ScanningFinishedFragment : Fragment() {
    // TODO: подменяй картинку в темной теме на scan_dark.png
    /** TODO: https://sky.pro/wiki/gamedev/uvedomleniya-i-fonovaya-rabota-v-android/
     *  по кнопке @+id/btnResultScanning отправляешь юзера на [StatisticsFragment]
     *  по кнопке @+id/btnCloseScanning отправляешь юзера на [ScanningInactiveFragment]
     *  по кнопке @+id/btnDeleteScanning останавливаешь сканирование, удаляешь результаты,
     *  юзеру показываешь [ScanningInactiveFragment].
     *  Так как это деструктивное действие, нам нужно пуш-уведомление с текстом:
     *  "Удалить результаты сканирования?" и кнопками "Да" и "Нет". На "Да" - очищаешь,
     *  на "Нет" - отправляешь на сервер.
     */

}