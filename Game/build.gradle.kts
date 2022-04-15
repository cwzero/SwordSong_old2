plugins {
    id("application")
}

dependencies {
    api(project(":Api"))
    implementation(project(":Engine"))
    implementation("com.liquidforte.phantasia:Engine")
    implementation("com.liquidforte.phantasia:Render")
}

application {
    mainClass.set("com.liquidforte.sword.game.main.Main")
}