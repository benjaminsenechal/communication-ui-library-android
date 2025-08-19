package com.azure.android.communication.ui.calling.config


object CallProxyConfig {
    @Volatile
    @JvmStatic
    var proxyUrl: String? = "" // défaut (ou null si tu préfères)
}
