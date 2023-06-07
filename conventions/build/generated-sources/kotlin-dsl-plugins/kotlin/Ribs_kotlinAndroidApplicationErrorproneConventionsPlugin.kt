/**
 * Precompiled [ribs.kotlin-android-application-errorprone-conventions.gradle.kts][Ribs_kotlin_android_application_errorprone_conventions_gradle] script plugin.
 *
 * @see Ribs_kotlin_android_application_errorprone_conventions_gradle
 */
public
class Ribs_kotlinAndroidApplicationErrorproneConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Ribs_kotlin_android_application_errorprone_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
