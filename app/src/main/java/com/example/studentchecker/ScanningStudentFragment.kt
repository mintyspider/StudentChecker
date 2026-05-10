package com.example.studentchecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Этот экран инициализируется всегда, если заходит Студент или Староста.
 * По кнопке @+id/btnMenu из toolbar_top.xml адо пересылать пользователя на настройки.
 * Если пользователя отсканировали, надо показать плашку @+id/cardScanned :3
 * Если вырублен Bluetooth, уведомление кидаешь внизу стандартное:
 * "Невозможно провести сканирование. Включите Bluetooth"
 * Просто скопируй и вставь.
 */

class ScanningStudentFragment : Fragment() {
    // TODO: подменяй картинку в темной теме на scan_dark.png
    // TODO: меняй подписи @+id/tvScanStatus <string name="student_scan_status_inactive">Сканирование\nнеактивно</string> и
    //    <string name="student_scan_status_active">Сканирование\nактивно</string> в зависимости от статуса сканирования
}