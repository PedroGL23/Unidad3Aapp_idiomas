package com.example.unidad3aapp_idiomas

import java.io.Serializable


data class Languages(
    val language:String,
    val image:String,
    val selectedLanguage: List<SelectedLanguage>
): Serializable

data class SelectedLanguage(
    val languageSelected: String
)

