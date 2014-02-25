package divinerpg.helper.event;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import divinerpg.helper.config.ConfigurationHelper;

public class DivineRPGCommands extends CommandBase{

	@Override
	public String getCommandName() {
		return "DivineRPG";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/DivineRPG <dimension>";
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		EntityPlayerMP playerMP = (EntityPlayerMP)var1;
		if (playerMP.timeUntilPortal > 0)
			playerMP.timeUntilPortal = 10;
		
		if (var2[0].equalsIgnoreCase("Eden")) {
			if (playerMP.dimension != ConfigurationHelper.Eden) {
				playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.Eden);
			}
		}
		
		if (var2[0].equalsIgnoreCase("WildWoods")) {
			if (playerMP.dimension != ConfigurationHelper.WildWoods) {
				playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.Eden);
			}
		}
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 1;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2) {
		return par2.length == 1 ? getListOfStringsMatchingLastWord(par2, new String[] {"Eden", "WildWoods"}) : null;
	}
}