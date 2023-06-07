/**
 * Precompiled [ribs.spotless-convention.gradle.kts][Ribs_spotless_convention_gradle] script plugin.
 *
 * @see Ribs_spotless_convention_gradle
 */
public
class Ribs_spotlessConventionPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Ribs_spotless_convention_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
