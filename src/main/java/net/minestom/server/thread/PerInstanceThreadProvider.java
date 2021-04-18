package net.minestom.server.thread;

import net.minestom.server.instance.Chunk;
import net.minestom.server.instance.Instance;
import org.jetbrains.annotations.NotNull;

/**
 * Each {@link Instance} gets assigned to a random thread.
 */
public class PerInstanceThreadProvider extends ThreadProvider {

    public PerInstanceThreadProvider(int threadCount) {
        super(threadCount);
    }

    @Override
    public long findThread(@NotNull Chunk chunk) {
        return chunk.getInstance().hashCode();
    }
}