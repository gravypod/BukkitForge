package keepcalm.mods.bukkit;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemInWorldManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class ModPlayer extends EntityPlayerMP {
	
	private static ItemInWorldManager iiwMngr;
	
	public ModPlayer() {
		this(MinecraftServer.getServer(), MinecraftServer.getServer().worldServerForDimension(0));
	}
	
	public ModPlayer(MinecraftServer server, World world) {
		this(server, world, BukkitContainer.MOD_USERNAME, (iiwMngr = new ItemInWorldManager(world)));
	}
	
	public ModPlayer(MinecraftServer server, World world, String name, ItemInWorldManager itemInWorldManager) {
		super(server, world, name, itemInWorldManager);
	}
	
	public void update(World world) {
		iiwMngr = new ItemInWorldManager(world);
	}
	
}
