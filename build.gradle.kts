// adding this helps intellij with resolving repositories to be able to download library docs and sources
plugins {
    bluemap.base
    id("org.graalvm.buildtools.native") version "0.11.1"
}

graalvmNative {
    toolchainDetection.set(true)
}

graalvmNative {
    binaries {
        named("main") {
            javaLauncher.set(javaToolchains.launcherFor {
                languageVersion.set(JavaLanguageVersion.of(21))
                vendor.set(JvmVendorSpec.matching("Oracle Corporation"))
            })
        }
    }
}