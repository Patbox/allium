package me.hugeblank.allium.loader;

import me.hugeblank.allium.Allium;

public class Manifest {
    private final String id;
    private final String version;
    private final String name;
    private final String entrypoint;

    Manifest(String id, String version, String name, String entrypoint) {
        this.id = id;
        this.version = version;
        this.name = name;
        this.entrypoint = entrypoint;
    }

    public String id() {
        return id;
    }

    public String version() {
        return version;
    }

    public String name() {
        return name;
    }

    public String entrypoint() {
        return entrypoint;
    }
}
