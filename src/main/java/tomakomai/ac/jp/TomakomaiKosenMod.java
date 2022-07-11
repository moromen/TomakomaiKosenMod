package tomakomai.ac.jp;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

/**
 * TomakomaiKosenMod for MinecraftJava
 * 苫小牧高専MOD
 * @author TangentMochi
 * @version 1.0.0
 */
@Mod(TomakomaiKosenMod.MOD_ID)
public class TomakomaiKosenMod {
    public static final String MOD_ID = "tomakomaikosenmod";

    private static final Logger LOGGER = LogManager.getLogger();
    public TomakomaiKosenMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event){
        LOGGER.info("Dirt block >> {}", Blocks.DIRT.getRegistryName());
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private void processIMC(final InterModProcessEvent event) {

    }


    private void doClientStuff(final FMLClientSetupEvent event){

    }
}
