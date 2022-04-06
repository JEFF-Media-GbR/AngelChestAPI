# AngelChest API

Developer API for [AngelChest Plus](https://www.spigotmc.org/resources/%E2%AD%90-angelchest-plus-%E2%AD%90-death-chests-graveyards.88214/) and [AngelChest Free](https://www.spigotmc.org/resources/angelchest-free.60383/)

Let me know on my Discord if you need any features that aren't available yet (link is at the bottom of this page)

## Maven repository
You can use maven to add AngelChest as a dependency to your Spigot-/Bukkit-Plugin. Please note that the API version is independent from AngelChest's release version. Just always use the latest available version as mentioned here.

```xml
<repositories>
	<repository>
		<id>jeff-media-public</id>
		<url>https://hub.jeff-media.com/nexus/repository/jeff-media-public/</url>
	</repository>
</repositories>
<dependencies>
	<dependency>
		<groupId>de.jeff_media</groupId>
		<artifactId>AngelChestAPI</artifactId>
		<version>5.0.0-SNAPSHOT</version>
        <scope>provided</scope>
	</dependency>
</dependencies>
```

## Accessing the API
Then you can access the API via the plugin manager:

```java
AngelChestPlugin angelChestPlugin = (AngelChestPlugin) getServer().getPluginManager().getPlugin("AngelChest");
```

## Example Plugin

Here is a complete example plugin that shows how to add and use the AngelChest API: [LINK](https://github.com/JEFF-Media-GbR/AngelChestAPIExample)

## Javadocs
- [AngelChestAPI Javadocs](https://hub.jeff-media.com/javadocs/angelchestapi/).
<!---- [ChestSortAPI source code](https://github.com/JEFF-Media-GbR/AngelChestAPI).-->

## Discord

If you need help, feel free to join my Discord server and head to #programming-help:

<a href="https://discord.jeff-media.de"><img src="https://api.jeff-media.de/img/discord1.png"></a>
