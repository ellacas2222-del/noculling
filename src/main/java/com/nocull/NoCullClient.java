package com.nocull;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class NoCullClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Apaga el occlusion culling (smartCull) cada tick para que nada lo reactive.
        // Asi los chunks subterraneos se dibujan aunque no esten conectados por aire a la camara.
        ClientTickEvents.END_CLIENT_TICK.register(mc -> mc.smartCull = false);
    }
}
