# API Usage
## Maven repository
You can use maven to add AngelChest as a dependency to your Spigot-/Bukkit-Plugin:

```xml
<repositories>
	<repository>
		<id>jeff-media-repo</id>
		<url>https://repo.jeff-media.de/maven2</url>
	</repository>
</repositories>
<dependencies>
	<dependency>
		<groupId>de.jeff_media</groupId>
		<artifactId>AngelChestAPI</artifactId>
		<version>1.2.0</version> <!-- The API version is independent of the AngelChest version -->
        	<scope>compile</scope>
	</dependency>
</dependencies>
```
<!---
If you use the `Sortable`class or the `ISortable` interface, you must also shade the ChestSortAPI into your plugin:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.1.0</version>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>shade</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
``` 
-->
## Accessing the API
Then you can access the API via the plugin manager:

```java
AngelChestPlugin angelChestPlugin = (AngelChestPlugin) getServer().getPluginManager().getPlugin("AngelChest");
if(angelChestPlugin==null) {
	getLogger().severe("Error: AngelChest is not installed.");
	return;
}
```

## Example Plugin

Here is a complete example plugin that shows how to add and use the AngelChest API: [LINK](https://github.com/JEFF-Media-GbR/AngelChestAPIExample)

## Javadocs
- [AngelChestAPI Javadocs](https://repo.jeff-media.de/javadocs/AngelChestAPI).
<!---- [ChestSortAPI source code](https://github.com/JEFF-Media-GbR/AngelChestAPI).-->
