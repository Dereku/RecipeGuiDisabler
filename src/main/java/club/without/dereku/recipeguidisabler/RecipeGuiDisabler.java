package club.without.dereku.recipeguidisabler;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class RecipeGuiDisabler extends JavaPlugin {

    @Override
    public void onEnable() {
        ProtocolLibrary.getProtocolManager().addPacketListener(
                new PacketAdapter(this, PacketType.Play.Server.RECIPES) {
                    public void onPacketSending(PacketEvent event) {
                        event.setCancelled(true);
                    }
        });
    }
}
