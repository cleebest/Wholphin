package com.github.damontecres.wholphin.mpv

import android.content.Context
import android.os.Looper
import androidx.annotation.OptIn
import androidx.media3.common.SimpleBasePlayer
import androidx.media3.common.util.UnstableApi
import kotlin.time.Duration

/**
 * Configuration options for the mpv player's on-screen controller and display.
 *
 * These options correspond to the osc.lua options introduced in dex2oat/mpv:
 * - dynamicMargins: Update video margins dynamically as OSC visibility changes
 * - subMargins: Automatically adjust subtitle position to avoid overlapping OSC
 * - osdMargins: Automatically adjust OSD message position to avoid overlapping OSC
 */
data class MpvOscOptions(
    val dynamicMargins: Boolean = false,
    val subMargins: Boolean = true,
    val osdMargins: Boolean = true,
)

/**
 * Stubs out MpvPlayer in wholphin-mpv
 */
@OptIn(UnstableApi::class)
class MpvPlayer(
    private val context: Context,
    private val enableHardwareDecoding: Boolean,
    private val useGpuNext: Boolean,
    private val oscOptions: MpvOscOptions = MpvOscOptions(),
) : SimpleBasePlayer(Looper.getMainLooper()) {
    override fun getState(): State = throw MpvStubException()

    var subtitleDelay: Duration = throw MpvStubException()
}
