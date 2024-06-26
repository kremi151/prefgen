package lu.kremi151.prefgen

import org.gradle.api.provider.Property

abstract class AndroidPrefgenPluginExtension {
	abstract val packageName: Property<String>
	abstract val generateFragments: Property<Boolean>
	abstract val generatePrefR: Property<Boolean>

	init {
		packageName.convention("")
		generateFragments.convention(true)
		generatePrefR.convention(true)
	}
}