package dependencies

object Versions {
    object AndroidX {
        const val compose = "1.1.1"
    }

    object Deps {
        object AndroidX {
            const val composeUI = "androidx.compose.ui:ui:${Versions.AndroidX.compose}"
            const val composeMaterial = "androidx.compose.material:material:${Versions.AndroidX.compose}"
            const val composeUIToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.AndroidX.compose}"
            const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.0"
            const val activityCompose = "androidx.activity:activity-compose:1.5.0"
            const val junit = "junit:junit:4.13.2"
            const val extJunit = "androidx.test.ext:junit:1.1.3"
            const val textEspressoCore = "androidx.test.espresso:espresso-core:3.4.0"
            const val uiTextJunit4 = "androidx.compose.ui:ui-test-junit4:${Versions.AndroidX.compose}"
            const val composeUITooling = "androidx.compose.ui:ui-tooling:${Versions.AndroidX.compose}"
        }
    }
}
