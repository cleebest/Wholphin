package com.github.damontecres.wholphin.mpv

/**
 * Stubs out MPVLib in wholphin-mpv
 */
object MPVLib {
    fun setPropertyString(
        key: String,
        value: String,
    ): Unit = throw MpvStubException()

    fun setPropertyInt(
        key: String,
        value: Int,
    ): Unit = throw MpvStubException()

    fun setPropertyDouble(
        key: String,
        value: Double,
    ): Unit = throw MpvStubException()

    fun setPropertyBoolean(
        key: String,
        value: Boolean,
    ): Unit = throw MpvStubException()

    /**
     * Set a raw mpv option (e.g., --script-opts=osc-deadzonesize=0.75).
     * Uses the mpv set_option_string API.
     */
    fun setOptionString(
        key: String,
        value: String,
    ): Unit = throw MpvStubException()

    /**
     * Send a raw mpv command (e.g., ["load-script", "/path/to/osc.lua"]).
     */
    fun command(vararg args: String): Unit = throw MpvStubException()
}
