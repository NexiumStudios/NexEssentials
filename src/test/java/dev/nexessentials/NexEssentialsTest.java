package dev.nexessentials;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;

import static org.junit.jupiter.api.Assertions.*;

class NexEssentialsTest {

    private ServerMock server;
    private NexEssentials plugin;

    @BeforeEach
    void setUp() {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(NexEssentials.class);
    }

    @AfterEach
    void tearDown() {
        MockBukkit.unmock();
    }

    @Test
    void pluginShouldEnableSuccessfully() {
        assertNotNull(plugin);
        assertTrue(plugin.isEnabled());
    }

    @Test
    void pluginShouldLoadDefaultConfiguration() {
        assertNotNull(plugin.getConfig());
        assertEquals("en", plugin.getConfig().getString("settings.language"));
    }
}
