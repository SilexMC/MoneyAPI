<h3 align="center"> <samp>⚙️ GRADLE</samp> </h3>

```kotlin
repositories {
    // JitPack
    maven("https://jitpack.io")
}

dependencies {
    // Money-API 
    compileOnly("com.github.SilexMC:MoneyAPI:1.0.0")
}
```

<br />

<h3 align="center"> <samp>⚙️ MAVEN</samp> </h3>

```xml
<repositories>
    <!-- JitPack -->
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <!-- Money-API -->
    <dependency>
        <groupId>com.github.SilexMC</groupId>
        <artifactId>MoneyAPI</artifactId>
        <version>1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

<br />

<h3 align="center"> <samp>🖥 EXAMPLE ON HOW TO USE</samp> </h3>

```java
public class PluginClass extends JavaPlugin {
    private final MoneyAPI moneyAPI;
    
    @Override
    public void onEnable() {
        if (!Bukkit.getPluginManager().isPluginEnabled("Money")) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        RegisteredServiceProvider<MoneyAPI> service = Bukkit.getServicesManager().getRegistration(MoneyAPI.class);
        if (service == null) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }
        this.moneyAPI = service.getProvider();
    }
}
```