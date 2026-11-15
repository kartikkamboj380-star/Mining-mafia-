package com.bytedance.adsdk.oq.fou;

/* JADX INFO: loaded from: classes.dex */
public enum bob {
    JSON(".json"),
    ZIP(".zip");

    public final String bob;

    bob(String str) {
        this.bob = str;
    }

    public String kq() {
        return ".temp" + this.bob;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.bob;
    }
}
