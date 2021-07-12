package com.vanced.manager.ui.widgets.settings

import androidx.compose.runtime.Composable
import com.vanced.manager.R
import com.vanced.manager.ui.components.preference.RadiobuttonDialogPreference
import com.vanced.manager.ui.preferences.RadioButtonPreference
import com.vanced.manager.ui.preferences.holder.managerThemePref
import com.vanced.manager.ui.resources.managerString

@Composable
fun ThemeSettingsItem() {
    RadiobuttonDialogPreference(
        preferenceTitle = managerString(stringId = R.string.settings_preference_theme_title),
        preference = managerThemePref,
        buttons = listOf(
            RadioButtonPreference(
                title = managerString(stringId = R.string.settings_preference_theme_light),
                key = "Light"
            ),
            RadioButtonPreference(
                title = managerString(stringId = R.string.settings_preference_theme_dark),
                key = "Dark"
            ),
            RadioButtonPreference(
                title = managerString(stringId = R.string.settings_option_system_default),
                key = "System Default"
            )
        )
    )
}