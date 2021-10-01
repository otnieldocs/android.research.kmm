object BuildPlugins {
    private object Versions {
        const val gradleBuildTools  = "7.0.2"
        const val gradlePlugin      = "1.5.31"
    }

    const val gradleBuildTools  = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
    const val gradlePlugin      = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.gradlePlugin}"
}

object AndroidSdk {
    const val compileSdk    = 31
    const val minSdk        = 21
    const val targetSdk     = 31
}

object Libraries {
    object Jetpack {
        private object Versions {
            const val coreKtx           = "1.6.0"
            const val appCompat         = "1.3.1"
            const val constraintLayout  = "2.1.1"
        }

        const val coreKtx           = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat         = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout  = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Test {
        private object Versions {
            const val jUnit         = "4.13.2"
            const val extJunit      = "1.1.3"
            const val espresso      = "3.4.0"
        }

        const val jUnit     = "junit:junit:${Versions.jUnit}"
        const val extJunit  = "androidx.test.ext:junit:{${Versions.extJunit}}"
        const val espresso  = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object Google {
        private object Versions {
            const val material = "1.4.0"
        }

        const val material = "com.google.android.material:material:${Versions.material}"
    }
}