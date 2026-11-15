package com.bytedance.sdk.component.rjo.bob;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private kq kq;
    private oq oq;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.rjo.bob.bob$bob, reason: collision with other inner class name */
    private static class C0254bob {
        private static final bob kq = new bob();
    }

    public enum kq {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public interface oq {
    }

    public static void kq(kq kqVar) {
        synchronized (bob.class) {
            C0254bob.kq.kq = kqVar;
        }
    }

    private bob() {
        this.kq = kq.OFF;
        this.oq = new com.bytedance.sdk.component.rjo.bob.oq();
    }
}
