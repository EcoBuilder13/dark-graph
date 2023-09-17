# Dark Graph
[![build](https://img.shields.io/github/actions/workflow/status/EcoBuilder13/dark-graph/build.yml?branch=1.20.x&logo=github&style=for-the-badge)](https://github.com/EcoBuilder13/dark-graph/actions) [![modrinth](https://img.shields.io/modrinth/dt/dark-graph?logo=modrinth&style=for-the-badge)](https://modrinth.com/mod/dark-graph)

A client mod that changes the debug graphs to use a dark theme. To access the frame time and Milliseconds per Tick (MSPT)/TPS graphs hold `F3` then press `2`, to switch to the network ping and bandwidth graphs hold `F3` then press `3`. The last open debug graph will stay open when you close the debug menu and you can select a graph either when opening the menu or while it is already open. Enter the keybind for the current open graph to toggle it off. For versions prior to 1.20.2 hold `alt` then press `F3` to access the frame time and MSPT graphs. 

When connected to a singleplayer world the bandwidth graph will be absent and the ping graph will be empty while listing 0ms ping. If you are connected to a dedicated server you will not see the MSPT graph as it is not sent to the client. If you would like to see it on your client you can install [Server Tick](https://modrinth.com/mod/servertick) on the server if it runs Fabric. Once you have done that all OPed players with Server Tick installed will be able to see it. You can also configure Server Tick to send it to all clients with the mod installed.

![example](https://github.com/EcoBuilder13/dark-graph/assets/68478692/a34d97c6-62b4-46b1-be50-ecab1ecab1cb)


## Inspiration
This mod was inspired by a ~~mistake~~ intentional design choice made by FoundationGames when making a [promotional image](https://cdn.discordapp.com/attachments/806436354799173663/840112305928011776/enhanced_bells.png) for his mod [Enhanced Block Entities](https://modrinth.com/mod/ebe).

## Compatibility
This mod should work with almost any other mod unless if it modifies the part of the code this mod interfaces. Compatibility has been tested with other mods such as [Sodium](https://modrinth.com/mod/sodium) and [Better F3](https://modrinth.com/mod/betterf3). If you run into issues please report it on the [issue tracker](https://github.com/EcoBuilder13/dark-graph/issues).

## FAQ

- Can you port to Forge?

    - No, there are no plans to port to Forge at this time.
- Can you port to another version?

    - I will only port to newer versions of the game. All releases have their version limited to all minor releases of the current major version when released.
