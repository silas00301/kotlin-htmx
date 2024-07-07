plugins {
    id("org.jlleitschuh.gradle.ktlint").version("12.1.1")
    id("io.gitlab.arturbosch.detekt").version("1.23.3")
}

detekt {
    source.setFrom("src")
}
